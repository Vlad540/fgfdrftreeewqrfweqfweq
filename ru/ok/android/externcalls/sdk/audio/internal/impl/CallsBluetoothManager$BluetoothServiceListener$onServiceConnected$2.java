package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.bluetooth.BluetoothProfile;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$2 extends b97 implements s16 {
    final /* synthetic */ int $profile;
    final /* synthetic */ BluetoothProfile $proxy;
    final /* synthetic */ CallsBluetoothManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsBluetoothManager$BluetoothServiceListener$onServiceConnected$2(CallsBluetoothManager callsBluetoothManager, int i, BluetoothProfile bluetoothProfile) {
        super(0);
        this.this$0 = callsBluetoothManager;
        this.$profile = i;
        this.$proxy = bluetoothProfile;
    }

    public final void invoke() {
        this.this$0.onServiceConnectedImpl(this.$profile, this.$proxy);
    }
}
