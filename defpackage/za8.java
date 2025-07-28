package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: za8  reason: default package */
public final class za8 extends f6c {
    public final LayoutInflater X;
    public final Drawable Y;
    public final Drawable Z;
    public final ArrayList o = new ArrayList();
    public final Drawable w0;
    public final Drawable x0;
    public final /* synthetic */ ab8 y0;

    public za8(ab8 ab8) {
        this.y0 = ab8;
        this.X = LayoutInflater.from(ab8.w0);
        int i = tlb.mediaRouteDefaultIconDrawable;
        Context context = ab8.w0;
        this.Y = fc8.e(context, i);
        this.Z = fc8.e(context, tlb.mediaRouteTvIconDrawable);
        this.w0 = fc8.e(context, tlb.mediaRouteSpeakerIconDrawable);
        this.x0 = fc8.e(context, tlb.mediaRouteSpeakerGroupIconDrawable);
        C();
    }

    public final void C() {
        ArrayList arrayList = this.o;
        arrayList.clear();
        ab8 ab8 = this.y0;
        arrayList.add(new xa8(ab8.w0.getString(nub.mr_chooser_title)));
        Iterator it = ab8.y0.iterator();
        while (it.hasNext()) {
            arrayList.add(new xa8((xb8) it.next()));
        }
        m();
    }

    public final int j() {
        return this.o.size();
    }

    public final int l(int i) {
        return ((xa8) this.o.get(i)).b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r2 != null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(defpackage.b7c r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.l(r7)
            java.util.ArrayList r5 = r5.o
            java.lang.Object r5 = r5.get(r7)
            xa8 r5 = (defpackage.xa8) r5
            r7 = 1
            if (r0 == r7) goto L_0x0074
            r1 = 2
            if (r0 == r1) goto L_0x0014
            goto L_0x0081
        L_0x0014:
            ya8 r6 = (defpackage.ya8) r6
            java.lang.Object r5 = r5.a
            xb8 r5 = (defpackage.xb8) r5
            r0 = 0
            android.view.View r2 = r6.J0
            r2.setVisibility(r0)
            android.widget.ProgressBar r0 = r6.L0
            r3 = 4
            r0.setVisibility(r3)
            fq r0 = new fq
            r0.<init>(r6, r5)
            r2.setOnClickListener(r0)
            java.lang.String r0 = r5.d
            android.widget.TextView r2 = r6.M0
            r2.setText(r0)
            za8 r0 = r6.N0
            r0.getClass()
            android.net.Uri r2 = r5.f
            if (r2 == 0) goto L_0x0055
            ab8 r3 = r0.y0     // Catch:{ IOException -> 0x0052 }
            android.content.Context r3 = r3.w0     // Catch:{ IOException -> 0x0052 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ IOException -> 0x0052 }
            java.io.InputStream r3 = r3.openInputStream(r2)     // Catch:{ IOException -> 0x0052 }
            r4 = 0
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r3, r4)     // Catch:{ IOException -> 0x0052 }
            if (r2 == 0) goto L_0x0055
            goto L_0x006e
        L_0x0052:
            r2.toString()
        L_0x0055:
            int r2 = r5.m
            if (r2 == r7) goto L_0x006b
            if (r2 == r1) goto L_0x0068
            boolean r5 = r5.e()
            if (r5 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r5 = r0.x0
        L_0x0063:
            r2 = r5
            goto L_0x006e
        L_0x0065:
            android.graphics.drawable.Drawable r5 = r0.Y
            goto L_0x0063
        L_0x0068:
            android.graphics.drawable.Drawable r5 = r0.w0
            goto L_0x0063
        L_0x006b:
            android.graphics.drawable.Drawable r5 = r0.Z
            goto L_0x0063
        L_0x006e:
            android.widget.ImageView r5 = r6.K0
            r5.setImageDrawable(r2)
            goto L_0x0081
        L_0x0074:
            wa8 r6 = (defpackage.wa8) r6
            java.lang.Object r5 = r5.a
            java.lang.String r5 = r5.toString()
            android.widget.TextView r6 = r6.J0
            r6.setText(r5)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za8.r(b7c, int):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [b7c, wa8] */
    public final b7c t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i == 1) {
            View inflate = layoutInflater.inflate(trb.mr_picker_header_item, viewGroup, false);
            ? b7c = new b7c(inflate);
            b7c.J0 = (TextView) inflate.findViewById(gob.mr_picker_header_name);
            return b7c;
        } else if (i != 2) {
            return null;
        } else {
            return new ya8(this, layoutInflater.inflate(trb.mr_picker_route_item, viewGroup, false));
        }
    }
}
