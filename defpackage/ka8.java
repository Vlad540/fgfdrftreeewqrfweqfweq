package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ka8  reason: default package */
public final class ka8 extends fn {
    public ListView A0;
    public boolean B0;
    public long C0;
    public final fx D0 = new fx(8, (Object) this);
    public final yb8 Y = yb8.d(getContext());
    public final ga8 Z = new ga8(this, 1);
    public TextView w0;
    public qb8 x0 = qb8.c;
    public ArrayList y0;
    public ja8 z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ka8(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = defpackage.fc8.a(r2, r0)
            int r0 = defpackage.fc8.b(r2)
            r1.<init>(r2, r0)
            qb8 r2 = defpackage.qb8.c
            r1.x0 = r2
            fx r2 = new fx
            r0 = 8
            r2.<init>((int) r0, (java.lang.Object) r1)
            r1.D0 = r2
            android.content.Context r2 = r1.getContext()
            yb8 r2 = defpackage.yb8.d(r2)
            r1.Y = r2
            ga8 r2 = new ga8
            r0 = 1
            r2.<init>(r1, r0)
            r1.Z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka8.<init>(android.content.Context):void");
    }

    public final void g() {
        if (this.B0) {
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
            Collections.sort(arrayList, zo4.c);
            if (SystemClock.uptimeMillis() - this.C0 >= 300) {
                this.C0 = SystemClock.uptimeMillis();
                this.y0.clear();
                this.y0.addAll(arrayList);
                this.z0.notifyDataSetChanged();
                return;
            }
            fx fxVar = this.D0;
            fxVar.removeMessages(1);
            fxVar.sendMessageAtTime(fxVar.obtainMessage(1, arrayList), this.C0 + 300);
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
        setContentView(trb.mr_chooser_dialog);
        this.y0 = new ArrayList();
        this.z0 = new ja8(getContext(), this.y0);
        ListView listView = (ListView) findViewById(gob.mr_chooser_list);
        this.A0 = listView;
        listView.setAdapter(this.z0);
        this.A0.setOnItemClickListener(this.z0);
        this.A0.setEmptyView(findViewById(16908292));
        this.w0 = (TextView) findViewById(gob.mr_chooser_title);
        getWindow().setLayout(pfa.p(getContext()), -2);
    }

    public final void onDetachedFromWindow() {
        this.B0 = false;
        this.Y.f(this.Z);
        this.D0.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void setTitle(CharSequence charSequence) {
        this.w0.setText(charSequence);
    }

    public final void setTitle(int i) {
        this.w0.setText(i);
    }
}
