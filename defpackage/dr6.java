package defpackage;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.a;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: dr6  reason: default package */
public final class dr6 extends a implements Closeable, hdf {
    public final b69 a;
    public final d b;
    public final ur3 c;

    public dr6(b69 b69, d dVar, ur3 ur3) {
        this.a = b69;
        this.b = dVar;
        this.c = ur3;
    }

    public final void a(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        ur3 ur3 = this.c;
        b69 b69 = this.a;
        d dVar = this.b;
        if (z) {
            b69.now();
            dVar.getClass();
            mdf mdf = mdf.b;
            dVar.getClass();
            dVar.getClass();
            if (ur3.a && (copyOnWriteArrayList2 = (CopyOnWriteArrayList) ur3.h) != null && !copyOnWriteArrayList2.isEmpty()) {
                c b2 = dVar.b2();
                Iterator it = ((CopyOnWriteArrayList) ur3.h).iterator();
                while (it.hasNext()) {
                    ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, mdf);
                }
                return;
            }
            return;
        }
        b69.now();
        dVar.getClass();
        mdf mdf2 = mdf.c;
        dVar.getClass();
        dVar.getClass();
        if (ur3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) ur3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b22 = dVar.b2();
            Iterator it2 = ((CopyOnWriteArrayList) ur3.h).iterator();
            while (it2.hasNext()) {
                ((ImagePerfDataListener) it2.next()).onImageVisibilityUpdated(b22, mdf2);
            }
        }
    }

    public final void close() {
        this.b.Z1();
    }

    public final void onDraw() {
    }

    public final void onEmptyEvent(Object obj) {
        sq6 sq6 = sq6.X;
        d dVar = this.b;
        dVar.getClass();
        this.c.p(dVar, sq6);
    }

    public final void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.c = str;
        dVar.getClass();
        sq6 sq6 = sq6.o;
        ur3 ur3 = this.c;
        ur3.p(dVar, sq6);
        mdf mdf = mdf.c;
        dVar.getClass();
        dVar.getClass();
        if (ur3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) ur3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) ur3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, mdf);
            }
        }
    }

    public final void onFinalImageSet(String str, Object obj, ControllerListener2.Extras extras) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.getClass();
        dVar.getClass();
        dVar.c = str;
        dVar.Y = (oq6) obj;
        this.c.p(dVar, sq6.c);
    }

    public final void onIntermediateImageSet(String str, Object obj) {
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.c = str;
        dVar.Y = (oq6) obj;
        this.c.p(dVar, sq6.b);
    }

    public final void onRelease(String str, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.getClass();
        dVar.c = str;
        sq6 sq6 = sq6.Y;
        ur3 ur3 = this.c;
        ur3.p(dVar, sq6);
        mdf mdf = mdf.c;
        dVar.getClass();
        dVar.getClass();
        if (ur3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) ur3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) ur3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, mdf);
            }
        }
    }

    public final void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.a.now();
        d dVar = this.b;
        dVar.a2();
        dVar.getClass();
        dVar.c = str;
        dVar.X = obj;
        dVar.getClass();
        sq6 sq6 = sq6.a;
        ur3 ur3 = this.c;
        ur3.p(dVar, sq6);
        mdf mdf = mdf.b;
        dVar.getClass();
        dVar.getClass();
        if (ur3.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) ur3.h) != null && !copyOnWriteArrayList.isEmpty()) {
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) ur3.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageVisibilityUpdated(b2, mdf);
            }
        }
    }
}
