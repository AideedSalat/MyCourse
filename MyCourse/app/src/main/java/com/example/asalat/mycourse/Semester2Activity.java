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

public class Semester2Activity extends AppCompatActivity {

   // DatabaseHelper2 myDb2;
    EditText editSemester, editName, editMarks, editTextId, editCat, editPrac, editProject, editExam, editLec;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;

    Button btnviewUpdate;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester2);
        //myDb2 = new DatabaseHelper2(this);

        editSemester = (EditText) findViewById(R.id.editText_semester);
        editName = (EditText) findViewById(R.id.editText_name);
        editMarks = (EditText) findViewById(R.id.editText_Marks);
        editTextId = (EditText) findViewById(R.id.editText_id);
        editCat = (EditText) findViewById(R.id.editText_cats);
        editPrac = (EditText) findViewById(R.id.editText_prac);
        editProject = (EditText) findViewById(R.id.editText_project);
        editExam = (EditText) findViewById(R.id.editText_exam);
        editLec = (EditText) findViewById(R.id.editText_module1);
        /*btnAddData = (Button) findViewById(R.id.button_add);
        btnviewAll = (Button) findViewById(R.id.button_viewAll);
        btnviewUpdate = (Button) findViewById(R.id.button_update);
        btnDelete = (Button) findViewById(R.id.button_delete);*/
        /*AddData();
        viewAll();
        UpdateData();
        DeleteData();*/
    }



   /* public void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb2.insertData(editSemester.getText().toString(),
                                editName.getText().toString(),
                                editMarks.getText().toString(),
                                editCat.getText().toString(),
                                editPrac.getText().toString(),
                                editProject.getText().toString(),
                                editExam.getText().toString(),
                                editLec.getText().toString());
                        if (isInserted == true)
                            Toast.makeText(Semester2Activity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Semester2Activity.this, "Data not Inserted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb2.getAllData();
                        if (res.getCount() == 0) {
                            // show message
                            showMessage("Error", "Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :" + res.getString(0) + "\n");
                            buffer.append("Semester :" + res.getString(1) + "\n");
                            buffer.append("Name :" + res.getString(2) + "\n");
                            buffer.append("Marks :" + res.getString(3) + "\n\n");
                            buffer.append("Cat :" + res.getString(4) + "\n\n");
                            buffer.append("Prac :" + res.getString(5) + "\n\n");
                            buffer.append("Project :" + res.getString(6) + "\n\n");
                            buffer.append("Exam :" + res.getString(7) + "\n\n");
                            buffer.append("Lecturer :" + res.getString(8) + "\n\n");
                        }

                        // Show all data
                        showMessage("Data", buffer.toString());
                    }
                }
        );
    }

    public void UpdateData() {
        btnviewUpdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = myDb2.updateData(editTextId.getText().toString(),
                                editSemester.getText().toString(),
                                editName.getText().toString(), editMarks.getText().toString()
                                , editCat.getText().toString(), editPrac.getText().toString()
                                , editProject.getText().toString(), editExam.getText().toString()
                                , editLec.getText().toString());
                        if (isUpdate == true)
                            Toast.makeText(Semester2Activity.this, "Data Update", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Semester2Activity.this, "Data not Updated", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void DeleteData() {
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb2.deleteData(editTextId.getText().toString());
                        if (deletedRows > 0)
                            Toast.makeText(Semester2Activity.this, "Data Deleted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Semester2Activity.this, "Data not Deleted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }



    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }*/


}

