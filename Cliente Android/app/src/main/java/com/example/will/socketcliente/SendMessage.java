package com.example.will.socketcliente;

import android.media.MediaRecorder;
import android.os.AsyncTask;
import android.widget.TextView;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SendMessage extends AsyncTask<Void, Void, String> {

    String dstAddress;
    int dstPort;
    String response = "";
    TextView textResponse;
    Socket socket;
    String X;

    SendMessage(String addr, int port, TextView textResponse) {
        dstAddress = addr;
        dstPort = port;
        X = null;

        this.textResponse = textResponse;
    }

    @Override
    protected String doInBackground(Void... arg0) {

        try {
            socket = new Socket(dstAddress, dstPort);

            try {
                OutputStream outStream = socket.getOutputStream();
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);

                Integer cont = 0;
                while(true) {
                    if(isCancelled())
                        break;
                    TimeUnit.MILLISECONDS.sleep(1500);
                    ArrayList<String> mandar = new ArrayList<String>();
                    mandar.add(X);


                    oos.writeObject(mandar);


                }



            }catch (IOException e){
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public void desconectar() throws Throwable {
        if(socket.isConnected()){
            socket.close();
        }
        this.finalize();
    }

    @Override
    protected void onPostExecute(String result) {
        textResponse.setText(response);
        super.onPostExecute(result);
    }


}