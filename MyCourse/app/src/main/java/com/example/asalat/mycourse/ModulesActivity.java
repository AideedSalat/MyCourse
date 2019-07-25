package com.example.asalat.mycourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.AlertDialog;
import android.database.Cursor;
//import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ModulesActivity extends AppCompatActivity {

    DatabaseHelper8 myDb8;
    EditText editSem,editModule1,editModule2 ,editModule3,editModule4,editModule5,editTextId;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;

    Button btnviewUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);
        myDb8 = new DatabaseHelper8(this);

        editSem = (EditText)findViewById(R.id.editText_sem);
        editModule1 = (EditText)findViewById(R.id.editText_module1);
        editModule2 = (EditText)findViewById(R.id.editText_module2);
        editModule3 = (EditText)findViewById(R.id.editText_module3);
        editModule4 = (EditText)findViewById(R.id.editText_module4);
        editModule5 = (EditText)findViewById(R.id.editText_module5);
        editTextId = (EditText)findViewById(R.id.editText_id);
        btnAddData = (Button)findViewById(R.id.button_add);
        btnviewAll = (Button)findViewById(R.id.button_viewAll);
        AddData();
        viewAll();

    }

    public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb8.insertData(editSem.getText().toString(),
                                editModule1.getText().toString(),
                                editModule2.getText().toString(),
                                editModule3.getText().toString(),
                                editModule4.getText().toString(),
                                editModule5.getText().toString()
                                );
                        if(isInserted == true)
                            Toast.makeText(ModulesActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(ModulesActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb8.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :"+ res.getString(0)+"\n");
                            buffer.append("Semester :"+ res.getString(1)+"\n");
                            buffer.append("Module1 :"+ res.getString(2)+"\n");
                            buffer.append("Module2 :"+ res.getString(3)+"\n\n");
                            buffer.append("Module3 :"+ res.getString(4)+"\n\n");
                            buffer.append("Module4 :"+ res.getString(5)+"\n\n");
                            buffer.append("Module5 :"+ res.getString(6)+"\n\n");
                        }

                        // Show all data
                        showMessage("Data",buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }



}

