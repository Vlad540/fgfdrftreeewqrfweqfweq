package defpackage;

import android.opengl.EGLDisplay;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: mc4  reason: default package */
public final /* synthetic */ class mc4 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mc4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((CountDownLatch) this.b).countDown();
                return;
            case 1:
                ((tg5) this.b).flush();
                return;
            case 2:
                rc4 rc4 = (rc4) this.b;
                EGLDisplay eGLDisplay = rc4.c;
                h96 h96 = rc4.b;
                try {
                    rc4.d.a();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = rc4.j;
                        if (i < arrayList.size()) {
                            ((o96) arrayList.get(i)).release();
                            i++;
                        } else {
                            rc4.i.release();
                            try {
                                h96.v(eGLDisplay);
                                return;
                            } catch (GlUtil$GlException e) {
                                ez3.B("Error releasing GL objects", e);
                                return;
                            }
                        }
                    }
                } catch (Exception e2) {
                    ez3.B("Error releasing shader program", e2);
                } catch (Throwable th) {
                    try {
                        h96.v(eGLDisplay);
                    } catch (GlUtil$GlException e3) {
                        ez3.B("Error releasing GL objects", e3);
                    }
                    throw th;
                }
            case 3:
                ope ope = ((xee) this.b).o;
                ope.getClass();
                ope.S();
                b24.a();
                return;
            case 4:
                ((ope) this.b).i();
                return;
            default:
                ((v2) this.b).h();
                return;
        }
    }
}
