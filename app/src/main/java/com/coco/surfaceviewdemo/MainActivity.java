package com.coco.surfaceviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.luozm.luckyboard.LuckyAward;
import com.luozm.luckyboard.LuckyBoard;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LuckyBoard luckyBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luckyBoard = findViewById(R.id.luckyboard);

        List<LuckyAward> awards = new ArrayList<>();
        awards.add(new LuckyAward("鹿晗", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526018701096&di=1d333d1a686a666cc647fdd904af6f99&imgtype=0&src=http%3A%2F%2Fh.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F562c11dfa9ec8a132cfbb440f203918fa1ecc0a9.jpg", 0.1f));
        awards.add(new LuckyAward("李易峰", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526018921159&di=d1d4411fdb80851a61f576ccc5f9f158&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F0df431adcbef7609d0a17ae12ddda3cc7cd99e22.jpg", 0.1f));
        awards.add(new LuckyAward("王源", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526018977755&di=6875bc65622e460308cb2b64d417581d&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F3b87e950352ac65c01891488f3f2b21192138ab8.jpg", 0.1f));
        awards.add(new LuckyAward("小乔", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526019042881&di=53bac558656a68cae424a696046490e9&imgtype=0&src=http%3A%2F%2Fpic.pc6.com%2Fup%2F2017-9%2F20179814555960806972.jpeg", 0.1f));
        awards.add(new LuckyAward("赵丽颖", "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3598569434,3999839788&fm=27&gp=0.jpg", 0.1f));
        awards.add(new LuckyAward("杨洋", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1842283516,4223170823&fm=27&gp=0.jpg", 0.1f));
        awards.add(new LuckyAward("杨洋", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1842283516,4223170823&fm=27&gp=0.jpg", 0.1f));
        luckyBoard.setAvAward(new LuckyAward("谢谢参与", "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=779089448,138943626&fm=27&gp=0.jpg", 0f));
        luckyBoard.setAwards(awards);
        luckyBoard.setResultCallback(new LuckyBoard.ResultCallback() {
            @Override
            public void result(LuckyAward award) {
                Toast.makeText(MainActivity.this, award.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
