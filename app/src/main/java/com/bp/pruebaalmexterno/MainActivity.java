package com.bp.pruebaalmexterno;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*getExternalStorageState permite comprobar la disponibilidad del medio
        * externo. */
        final String storageState = Environment.getExternalStorageState();

        /* MEDIA_BAD_REMOVAL: Se ha desconectado sin ser desmontado.
        *  MEDIA_CHECKING: Se está comprobando el almacenamiento.
        *  MEDIA_MOUNTED: El almacenamiento esta disponible en modo lectura/escritura.
        *  MEDIA_MOUNTED_READ_ONLY: El almacenamiento esta disponible en modo lectura.
        *  MEDIA_NOFS: Formato no soportado.
        *  MEDIA_REMOVED: Medio no disponible.
        *  MEDIA_SHARED: Almacenamiento usado en USB.
        *  MEDIA_UNMOUNTED: Medio disponible pero no montado.*/

        if (storageState.equals(Environment.MEDIA_MOUNTED)) {
            File outFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        } else if (storageState.equals(Environment.MEDIA_MOUNTED_READ_ONLY)) {
            File sharedFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        } else if (storageState.equals(Environment.MEDIA_REMOVED)) {
        } else {
            //Otro caso.
        }

        /*Acceder a los archivos: getExternalFileDir(tipo).
        * Acceder a archivos compartidos: getExternalStoragePublicDirectory(tipo).
        *
        * DIRECTORY_DCIM: imágenes y fotos.
        * DIRECTORY_DOWNLOADS: descargar.
        * DIRECTORY_MUSIC: música.*/

    }
}
