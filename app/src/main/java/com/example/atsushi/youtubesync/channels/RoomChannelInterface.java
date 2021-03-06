package com.example.atsushi.youtubesync.channels;

import com.google.gson.JsonElement;

/**
 * Created by atsushi on 2017/10/08.
 */

public interface RoomChannelInterface {
    void onConnected();
    void onReceived(JsonElement data);
    void onDisconnected();
    void onFailed();
}
