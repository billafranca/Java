package com.example.sqlitebd.controller;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;

import com.example.sqlitebd.api.AppUtil;
import com.example.sqlitebd.datasource.AppDataBase;

public class ClienteController extends AppDataBase {
    public ClienteController(Context context) {
        super(context);
        Log.i(AppUtil.TAG, "ClienteController: Conectado ao banco.");

    }
}
