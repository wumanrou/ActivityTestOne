package activity;

import com.example.activitytextone.R;
import com.example.activitytextone.R.layout;
import com.example.activitytextone.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static final String TAG="MainActivity";
	
	TextView tvC1,tvC2,tvC3,tvJia,tvC4,tvC5,tvC6,tvJian,tvC7,tvC8,tvC9,tvCheng,tvChu,tvDeng,tvDian,tvClear,tvBackspace;
	EditText etResult;

	private boolean flag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		registerControl();
		addClickListener();
	}
	
	//注册控件
	private void registerControl(){
		tvC1=(TextView) this.findViewById(R.id.tvC1);
		tvC2=(TextView) this.findViewById(R.id.tvC2);
		tvC3=(TextView) this.findViewById(R.id.tvC3);
		tvJia=(TextView) this.findViewById(R.id.tvJia);
		tvC1=(TextView) this.findViewById(R.id.tvC4);
		tvC2=(TextView) this.findViewById(R.id.tvC5);
		tvC3=(TextView) this.findViewById(R.id.tvC6);
		tvJia=(TextView) this.findViewById(R.id.tvJian);	
		tvC1=(TextView) this.findViewById(R.id.tvC1);
		tvC2=(TextView) this.findViewById(R.id.tvC2);
		tvC3=(TextView) this.findViewById(R.id.tvC3);
		tvJia=(TextView) this.findViewById(R.id.tvCheng);
		tvC1=(TextView) this.findViewById(R.id.tvChu);
		tvC2=(TextView) this.findViewById(R.id.tvDeng);
		tvC3=(TextView) this.findViewById(R.id.tvDian);
		tvJia=(TextView) this.findViewById(R.id.tvClear);
		tvJia=(TextView) this.findViewById(R.id.tvBackspace);
		etResult=(EditText) this.findViewById(R.id.etResult);
	}
	
	//监听器，监听所有事件的相关操作
	private void addClickListener(){
		tvOnClickListener tvc1 =new tvOnClickListener ();
		tvC1.setOnClickListener(tvc1);	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public class tvOnClickListener implements OnClickListener{
		
		@Override

		public void onClick(View v){
			// TODO Auto-generated method stub

			switch(v.getId()){
			case R.id.tvC1:
				Log.i(TAG,"value: 1");
				gengerateBDS("1");
				break;
			case R.id.tvC2:
				Log.i(TAG,"value: 2");
				gengerateBDS("2");
				break;
			case R.id.tvC3:
				Log.i(TAG,"value: 3");
				gengerateBDS("3");
				break;
			case R.id.tvC4:
				Log.i(TAG,"value: 4");
				gengerateBDS("4");
				break;
			case R.id.tvC5:
				Log.i(TAG,"value: 5");
				gengerateBDS("5");
				break;
			case R.id.tvC6:
				Log.i(TAG,"value: 6");
				gengerateBDS("6");
				break;
			case R.id.tvC7:
				Log.i(TAG,"value: 7");
				gengerateBDS("7");
				break;
			case R.id.tvC8:
				Log.i(TAG,"value: 8");
				gengerateBDS("8");
				break;
			case R.id.tvC9:
				Log.i(TAG,"value: 9");
				gengerateBDS("9");
				break;
			case R.id.tvC0:
				Log.i(TAG,"value: 0");
				gengerateBDS("0");
				break;
			case R.id.tvJia:
				Log.i(TAG,"value: +");
				calBDS("+");
				break;
			case R.id.tvJian:
				Log.i(TAG,"value: -");
				calBDS("-");
				break;
			case R.id.tvCheng:
				Log.i(TAG,"value: *");
				calBDS("*");
				break;
			case R.id.tvChu:
				Log.i(TAG,"value: /");
				calBDS("/");
				break;
			case R.id.tvDian:
				Log.i(TAG,"value: .");
				break;
			case R.id.tvClear:
				etResult.setText("");
				break;
			default:
				break;
			}
		}
	}
	
	// 响应数字的事件操作
		private void gengerateBDS(String str){
			String oldStr="";// null
			oldStr=etResult.getText().toString();
			System.out.println("--------------");
			if(oldStr.equals("")||oldStr=="" || oldStr.length()==0 ){
				etResult.setText(str);
			}else if(oldStr.equals("0")){
				etResult.setText(str);
			}else{
				etResult.setText(oldStr+str);
			}
			boolean flag = false;
		}
		
		// 响应运算符的事件操作
		private void calBDS(String str){
			String oldStr="";// null
			oldStr=etResult.getText().toString();
			boolean flag = false;
			if(flag){
				// 防止运算符叠加
			}else{
				if(str.equals("*")||str.equals("/")){
					etResult.setText("("+oldStr+")"+str);
				}else{
					etResult.setText(oldStr+str);
				}
				flag=true;
			}		
		}

}

