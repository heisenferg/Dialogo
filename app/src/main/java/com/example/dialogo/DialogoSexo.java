package com.example.dialogo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class DialogoSexo extends DialogFragment {
    RespuestaDialogoSexo respuesta;

    @Override
    public Dialog onCreateDialog(Bundle savedInsatncerState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Título:
        builder.setTitle("Pregunta importante: ");

        //Pregunta
        builder.setMessage("¿Eres chica?");

        //Botón sí
        builder.setPositiveButton("Sí, lo soy.", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                respuesta.onRespuesta("ES MUJER");
            }
        });

        //Botón no.
        builder.setNegativeButton("No lo soy.", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                respuesta.onRespuesta("Es un hombre.");
            }
        });

        //Creación alertDialgo
        return builder.create();
    }

    public interface RespuestaDialogoSexo{
        public void onRespuesta(String s);
    }

    public void onAttach(Context context){
        super.onAttach(context);
        respuesta = (RespuestaDialogoSexo) context;
    }
}
