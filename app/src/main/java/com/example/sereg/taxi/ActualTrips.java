package com.example.sereg.taxi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.app.ListActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.content.DialogInterface;
import android.widget.Toast;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import org.w3c.dom.Text;



 public class ActualTrips extends ListActivity {

     public void onCreate(Bundle icicle) {

         super.onCreate(icicle);
         String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                 "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                 "Linux", "OS/2" };
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                 android.R.layout.simple_list_item_1, values);
         setListAdapter(adapter);

     }
     private String m_Text = "hh";

     @Override
     protected void onListItemClick(ListView l, View v, int position, long id) {
         super.onListItemClick(l, v, position, id);

         String item = (String) getListAdapter().getItem(position);

         AlertDialog.Builder a_builder = new AlertDialog.Builder(ActualTrips.this);
         a_builder.setTitle("ляля");

         final EditText input = new EditText(ActualTrips.this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
         input.setInputType(InputType.TYPE_CLASS_TEXT);
         a_builder.setView(input);

         a_builder.setCancelable(false);
                 a_builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                     @Override
                                 public void onClick (DialogInterface dialog, int which){
                         dialog.cancel();
                         }
                     });
                 a_builder.setNegativeButton("no", new DialogInterface.OnClickListener(){
                         @Override
                                 public void onClick (DialogInterface dialog, int which){
                             dialog.cancel();
                         }
                     });
         AlertDialog alert = a_builder.create();
         alert.show();
                 }


     }




