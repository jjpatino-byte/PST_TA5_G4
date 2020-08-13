package com.example.LibOnline;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;

import androidx.constraintlayout.widget.ConstraintLayout;

public class CuadroDialogo {

    public CuadroDialogo(Context contexto){
        final Dialog dialogo = new Dialog(contexto);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(true);
        dialogo.getWindow();
        dialogo.setContentView(R.layout.cuadro_dialogo);

        ConstraintLayout cl = (ConstraintLayout)dialogo.findViewById(R.id.cons);

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogo.dismiss();
            }
        });

        dialogo.show();
    }

}
