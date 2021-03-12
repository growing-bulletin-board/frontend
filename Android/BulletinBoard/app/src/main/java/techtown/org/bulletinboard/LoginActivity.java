package techtown.org.bulletinboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 추후 구글 로그인과 연동
       btn_login = (Button) findViewById(R.id.btn_login);
       btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                finish(); // 로그인이 성공적으로 완료됐다는 가정하에 로그인 화면은 로그인 이후에 Activity상에서 날리기 위해서 설정함
            }
        });
    }
}