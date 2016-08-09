package com.example.duyongkang.testauto;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExpandableTextView expTv = (ExpandableTextView) findViewById(R.id.expand_text_view);
        //expTv.setText("hello world");
        expTv.setText("谷歌对各版本的系统安装量进行了追踪，去年12月，Android 4.4 KitKat系统的份额从33.9（百分之）升至39.1（百分之），而Android 5.0甚至没有出现在榜单上。\n" +
                "        需要注意的是，谷歌在报告中并没有对份额低于0.1（百分之）的系统进行统计。两 年前发布的Android 4.3 Jelly Bean系统依然占据主导地位，份额为 46（百分之），Android 4.0 Ice Cream Sandwich的\n" +
                "        份额为6.7（百分之），Android 2.3 Gingerbread的份额为 7.8（百分之），Android 2.2 Froyo的份额为0.4（百分之）。尽管很多用户尚未用上Android 5.0系统，但这并不妨碍 谷歌的更新不发。消息称，谷歌可能\n" +
                "        会在今年2月发布Android 5.1，更新包括：Android 5.0中缺失的静音模式被重新加入；系统稳定性提 升；改进内存管理性能；修复应用突然关闭问题；修复使用Wi-Fi时网络设备过度消耗问题；修复\n" +
                "        无线网络连接问题。");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
