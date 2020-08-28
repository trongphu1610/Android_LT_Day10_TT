package com.example.lt_day10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lt_day10.adapter.ContactAdapter;
import com.example.lt_day10.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ContactActicity extends AppCompatActivity {
    private ListView lv_person;
    private ContactAdapter contactAdapters;
    private List<Person> arrPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_acticity);
        lv_person = findViewById(R.id.lv_person);
        arrPerson = new ArrayList<>();
        arrPerson.add(new Person("Phu", "0962692886"));
        arrPerson.add(new Person("Mai", "0962692886"));
        arrPerson.add(new Person("Loan", "0962692886"));
        arrPerson.add(new Person("Doan", "0962692886"));
        arrPerson.add(new Person("Hia", "0962692886"));
        arrPerson.add(new Person("Phong", "0962692886"));
        arrPerson.add(new Person("Cong", "0962692886"));
        arrPerson.add(new Person("Bang", "0962692886"));
        arrPerson.add(new Person("Hia", "0962692886"));
        arrPerson.add(new Person("Phong", "0962692886"));
        arrPerson.add(new Person("Cong", "0962692886"));
        arrPerson.add(new Person("Bang", "0962692886"));
        arrPerson.add(new Person("Hia", "0962692886"));
        arrPerson.add(new Person("Phong", "0962692886"));
        arrPerson.add(new Person("Cong", "0962692886"));
        arrPerson.add(new Person("Bang", "0962692886"));
        contactAdapters = new ContactAdapter(this, arrPerson);
        lv_person.setAdapter(contactAdapters);
        lv_person.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Person person = arrPerson.get(position);
                Toast.makeText(ContactActicity.this,"call" + person.getPhone(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}