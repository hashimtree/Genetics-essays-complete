package com.passs.my;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class MainActivity55 extends Activity {

EditText editText, editText2,editText3,editText4,editText5;
Button btn, btn2, btn3,btn4,btn5;
TextView textView, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
  editText=(EditText)findViewById(R.id.editText); editText2=(EditText)findViewById(R.id.editText2);  editText3=(EditText)findViewById(R.id.editText3);
editText4=(EditText)findViewById(R.id.editText4);  editText5=(EditText)findViewById(R.id.editText5);
   textView=(TextView)findViewById(R.id.textView); textView2=(TextView)findViewById(R.id.textView2);  
   
 btn=(Button)findViewById(R.id.btn);  
 btn2=(Button)findViewById(R.id.btn2);
 
 btn3=(Button)findViewById(R.id.btn3);  
 btn4=(Button)findViewById(R.id.btn4);
 btn5=(Button)findViewById(R.id.btn5);
 
   ////////
 btn5.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){  
 
 Intent intent=new  Intent(MainActivity55.this, MainActivity66.class);
 startActivity(intent); 
  }}); 
   
 final  int total = 30;
 
  // the total number
//...
//when you want to start the counting start the thread bellow.//
 

btn.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("1. Write  Short notes about Sex-Linked traits");   
final String pas[]={"located only on the X chromosome","up in males","dominant or recessive"};

  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
}  
 textView.setText("لقد احرزت: "+"Third Page..."+counter); 
textView.setTextColor(Color.BLUE); 
   }
}});
//////
/////
//////
//////
//////
btn2.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("2. What is congenital disease?"); 
final String pas[]={"present at birth"};

  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
}  
 textView.setText("لقد احرزت: "+"Third Page..."+counter); 
textView.setTextColor(Color.BLUE); 
   }
}});
//////
/////
btn3.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("3. What is Heredatory disease?");   
final String pas[]={"chromosome abnormality","defective gene"};

  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
}  
 textView.setText("لقد احرزت: "+"Third Page..."+counter); 
textView.setTextColor(Color.BLUE); 
   }
}});
//////

btn4.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("4. Write short note about Albinism");   
final String pas[]={"unable to produce pigment","eye pigments","Skin pigments","light sensitive","Autosomal recessive"};

  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
}  
 textView.setText("لقد احرزت: "+"Third Page..."+counter); 
textView.setTextColor(Color.BLUE); 
   }
}});


























///////%$%%$$///////////


}
}
//////


