package defpackage;

/* renamed from: edc  reason: default package */
public enum edc {
    END(vsb.call_finished),
    INCOMING(vsb.call_incoming),
    BEEP(vsb.call_ringing),
    BUSY(vsb.call_busy),
    CONNECTING(vsb.call_connecting),
    CONNECTED(vsb.call_connected);
    
    public final int a;

    /* access modifiers changed from: public */
    edc(int i) {
        this.a = i;
    }
}
