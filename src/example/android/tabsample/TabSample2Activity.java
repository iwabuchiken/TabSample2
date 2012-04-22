package example.android.tabsample;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class TabSample2Activity extends TabActivity {
    // onCreate���\�b�h(��ʏ����\���C�x���g�n���h��)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // �X�[�p�[�N���X��onCreate���\�b�h�Ăяo��
        super.onCreate(savedInstanceState);
        
        // TabHost�擾
        TabHost tabHost = getTabHost();

        // TabHost�ƃ��C�A�E�g�ƃr���[�̐ݒ�t�@�C�����֘A�t��
        LayoutInflater.from(this).inflate(R.layout.tabsample2,
                tabHost.getTabContentView(), true);

        // �e�L�X�g�r���[�ɐF��ݒ�
        TextView txt1 = (TextView) findViewById(R.id.textview1);
        txt1.setBackgroundColor(Color.GREEN);
        TextView txt2 = (TextView) findViewById(R.id.textview2);
        txt2.setBackgroundColor(Color.BLUE);

        // �^�u1�̐ݒ�
        TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setIndicator("�^�u1");
        tab1.setContent(R.id.linearlayout1);
        
        // �^�u2�̐ݒ�
        TabSpec tab2 = tabHost.newTabSpec("tab2");
        tab2.setIndicator("�^�u2",getResources().getDrawable(android.R.drawable.ic_menu_edit));
        tab2.setContent(R.id.textview1);

        // �^�u3�̐ݒ�
        TabSpec tab3 = tabHost.newTabSpec("tab3");
        tab3.setIndicator("�^�u3",getResources().getDrawable(android.R.drawable.ic_menu_search));
        tab3.setContent(R.id.textview2);

        // �e�^�u��TabHost�ɐݒ�
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

        // �����\���̃^�u�ݒ�
        tabHost.setCurrentTab(1);

    }//public void onCreate(Bundle savedInstanceState)
}//public class TabSample2Activity extends TabActivity