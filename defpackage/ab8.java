package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ab8  reason: default package */
public final class ab8 extends fn {
    public RecyclerView A0;
    public boolean B0;
    public xb8 C0;
    public final long D0;
    public long E0;
    public final fx F0 = new fx(9, (Object) this);
    public final yb8 Y;
    public final ga8 Z;
    public final Context w0;
    public qb8 x0 = qb8.c;
    public ArrayList y0;
    public za8 z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ab8(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = defpackage.fc8.a(r3, r0)
            int r0 = defpackage.fc8.b(r3)
            r2.<init>(r3, r0)
            qb8 r3 = defpackage.qb8.c
            r2.x0 = r3
            fx r3 = new fx
            r0 = 9
            r3.<init>((int) r0, (java.lang.Object) r2)
            r2.F0 = r3
            android.content.Context r3 = r2.getContext()
            yb8 r0 = defpackage.yb8.d(r3)
            r2.Y = r0
            ga8 r0 = new ga8
            r1 = 3
            r0.<init>(r2, r1)
            r2.Z = r0
            r2.w0 = r3
            android.content.res.Resources r3 = r3.getResources()
            int r0 = defpackage.jrb.mr_update_routes_delay_ms
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.D0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab8.<init>(android.content.Context):void");
    }

    public final void g() {
        if (this.C0 == null && this.B0) {
            this.Y.getClass();
            yb8.b();
            ub8 c = yb8.c();
            ArrayList arrayList = new ArrayList(c == null ? Collections.emptyList() : c.g);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                xb8 xb8 = (xb8) arrayList.get(i);
                if (xb8.d() || !xb8.g || !xb8.h(this.x0)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, zo4.o);
            long uptimeMillis = SystemClock.uptimeMillis() - this.E0;
            long j = this.D0;
            if (uptimeMillis >= j) {
                this.E0 = SystemClock.uptimeMillis();
                this.y0.clear();
                this.y0.addAll(arrayList);
                this.z0.C();
                return;
            }
            fx fxVar = this.F0;
            fxVar.removeMessages(1);
            fxVar.sendMessageAtTime(fxVar.obtainMessage(1, arrayList), this.E0 + j);
        }
    }

    public final void h(qb8 qb8) {
        if (qb8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.x0.equals(qb8)) {
            this.x0 = qb8;
            if (this.B0) {
                yb8 yb8 = this.Y;
                ga8 ga8 = this.Z;
                yb8.f(ga8);
                yb8.a(qb8, ga8, 1);
            }
            g();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0 = true;
        this.Y.a(this.x0, this.Z, 1);
        g();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(trb.mr_picker_dialog);
        Context context = this.w0;
        int i = fc8.a;
        getWindow().getDecorView().setBackgroundColor(hq3.a(context, fc8.i(context) ? gmb.mr_dynamic_dialog_background_light : gmb.mr_dynamic_dialog_background_dark));
        this.y0 = new ArrayList();
        ((ImageButton) findViewById(gob.mr_picker_close_button)).setOnClickListener(new jsc(6, this));
        this.z0 = new za8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(gob.mr_picker_list);
        this.A0 = recyclerView;
        recyclerView.setAdapter(this.z0);
        this.A0.setLayoutManager(new LinearLayoutManager());
        int i2 = -1;
        int p = !context.getResources().getBoolean(zlb.is_tablet) ? -1 : pfa.p(context);
        if (context.getResources().getBoolean(zlb.is_tablet)) {
            i2 = -2;
        }
        getWindow().setLayout(p, i2);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = false;
        this.Y.f(this.Z);
        this.F0.removeMessages(1);
    }
}
