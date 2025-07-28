package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* renamed from: ls4  reason: default package */
public final class ls4 implements os4 {
    public final ps4 a;
    public jpa b;
    public nu7 c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f = -65536;
    public float g = 24.0f;
    public boolean h = false;

    public ls4(ps4 ps4) {
        this.a = ps4;
        ps4.setListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        r5 = (java.lang.Integer) r4.get(r5.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.js4 a() {
        /*
            r11 = this;
            ps4 r0 = r11.a
            java.util.List r1 = r0.getLayers()
            java.util.ArrayList r11 = r11.d
            android.graphics.Rect r2 = r0.getBounds()
            boolean r0 = r0.C0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 1
        L_0x001d:
            boolean r6 = r1.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = r1.next()
            is4 r6 = (defpackage.is4) r6
            boolean r8 = r6 instanceof defpackage.rn4
            if (r8 == 0) goto L_0x0045
            r7 = r6
            rn4 r7 = (defpackage.rn4) r7
            android.graphics.Paint r8 = r7.c
            int r8 = r8.getColor()
            android.graphics.Paint r9 = r7.c
            float r9 = r9.getStrokeWidth()
            java.util.ArrayList r7 = r7.a
            o97 r10 = new o97
            r10.<init>(r5, r8, r9, r7)
            r7 = r10
        L_0x0045:
            if (r7 == 0) goto L_0x001d
            r3.add(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.put(r6, r7)
            int r5 = r5 + 1
            goto L_0x001d
        L_0x0054:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x005d:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r11.next()
            w9 r5 = (defpackage.w9) r5
            boolean r6 = r5 instanceof defpackage.w9
            if (r6 == 0) goto L_0x0081
            is4 r5 = r5.a
            java.lang.Object r5 = r4.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0081
            int r5 = r5.intValue()
            v33 r6 = new v33
            r6.<init>((int) r5)
            goto L_0x0082
        L_0x0081:
            r6 = r7
        L_0x0082:
            if (r6 == 0) goto L_0x005d
            r1.add(r6)
            goto L_0x005d
        L_0x0088:
            js4 r11 = new js4
            r11.<init>(r3, r1, r2, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls4.a():js4");
    }

    public final void b() {
        jpa jpa = this.b;
        if (jpa != null) {
            boolean z = !this.e.isEmpty();
            ArrayList arrayList = this.d;
            boolean z2 = this.h;
            npa npa = jpa.e;
            npa.getClass();
            npa npa2 = new npa(z, !arrayList.isEmpty(), !arrayList.isEmpty(), npa.o, npa.X, z2, npa.Z);
            jpa.e = npa2;
            jpa.a.a(npa2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [nu7, java.lang.Object] */
    public final void c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ps4 ps4 = this.a;
        if (action == 0) {
            motionEvent.getX();
            motionEvent.getY();
            List<is4> layers = ps4.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                is4 is4 = layers.get(size);
            }
            rn4 rn4 = new rn4(this.f, this.g);
            ? obj = new Object();
            obj.b = new ArrayList();
            obj.a = rn4;
            this.c = obj;
            ((ArrayList) obj.b).add(new tn4(motionEvent.getX(), motionEvent.getY()));
            ps4.a.add(rn4);
            ps4.invalidate();
            jpa jpa = this.b;
            if (jpa != null) {
                ((BrushWidthViewImpl) jpa.a.x0).setVisibility(8);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            nu7 nu7 = this.c;
            if (nu7 != null) {
                nu7.w(motionEvent);
            }
            nu7 nu72 = this.c;
            if (nu72 != null) {
                w9 m = nu72.m();
                this.e.clear();
                this.d.add(m);
            }
            this.c = null;
            this.h = true;
            b();
        } else {
            nu7 nu73 = this.c;
            if (nu73 != null) {
                nu73.w(motionEvent);
            }
        }
        ps4.invalidate();
    }
}
