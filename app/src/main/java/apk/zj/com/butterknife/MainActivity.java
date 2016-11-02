package apk.zj.com.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindColor(R.color.colorAccent)
    int color;
    @BindView(R.id.textView)
    TextView mTextView;
    @BindView(R.id.textView2)
    TextView mTextView2;
    private Unbinder bind;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind = ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onClick() {
        mTextView.setText("zhangjin");
        mTextView2.setTextColor(color);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
