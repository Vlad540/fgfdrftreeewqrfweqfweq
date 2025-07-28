package defpackage;

import android.media.MediaDrm;

/* renamed from: kz5  reason: default package */
public final /* synthetic */ class kz5 implements MediaDrm.OnEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        switch (this.a) {
            case 0:
                ((nz5) this.b).getClass();
                fx fxVar = ((y64) ((lv1) this.c).b).y;
                fxVar.getClass();
                fxVar.obtainMessage(i, bArr).sendToTarget();
                return;
            default:
                ((nz5) this.b).getClass();
                fx fxVar2 = ((z64) ((mv4) this.c).b).y;
                fxVar2.getClass();
                fxVar2.obtainMessage(i, bArr).sendToTarget();
                return;
        }
    }
}
