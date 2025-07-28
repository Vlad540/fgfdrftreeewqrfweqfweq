package ru.ok.android.externcalls.sdk;

import android.os.Handler;

public class AudioSampleEnergyCalculator implements u39 {
    private final Handler mainThreadHandler;
    private final j50 processor = new j50();

    public AudioSampleEnergyCalculator(Handler handler) {
        this.mainThreadHandler = handler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSample$0(long j) {
        this.processor.a(j);
    }

    public j50 getProcessor() {
        return this.processor;
    }

    public void onSample(int i, int i2, int i3, gia gia) {
        long j = 0;
        int i4 = 0;
        while (true) {
            int i5 = gia.a;
            if (i4 < i5) {
                short a = gia.a(i4);
                j += (long) (a * a);
                i4++;
            } else {
                this.mainThreadHandler.post(new q50(this, (long) Math.sqrt((double) (j / ((long) i5))), 2));
                return;
            }
        }
    }
}
