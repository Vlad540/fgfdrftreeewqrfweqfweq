package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: axa  reason: default package */
public final class axa extends w9b {
    public final /* synthetic */ int J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ axa(View view) {
        super(view);
        this.J0 = 0;
    }

    public final void A(pg7 pg7) {
        CharSequence charSequence = "";
        View view = this.a;
        switch (this.J0) {
            case 0:
                TextView textView = (TextView) view;
                CharSequence a = ((hxa) pg7).a.a(textView.getContext());
                if (a != null) {
                    charSequence = a;
                }
                textView.setText(charSequence);
                urd.B(new y9(3, (Continuation) null, 20), textView);
                return;
            case 1:
                xsc xsc = (xsc) pg7;
                TextView textView2 = (TextView) view;
                CharSequence a2 = xsc.a.a(textView2.getContext());
                if (a2 != null) {
                    charSequence = a2;
                }
                textView2.setText(charSequence);
                urd.B(new f5c(xsc, (Continuation) null, 1), textView2);
                nge nge = nte.a;
                xsc.c.b(textView2, yq4.b);
                return;
            default:
                kdd kdd = (kdd) pg7;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View, n7d] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public axa(android.content.Context r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r0.J0 = r2
            switch(r2) {
                case 2: goto L_0x001d;
                default: goto L_0x000b;
            }
        L_0x000b:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            r0.<init>(r2)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            return
        L_0x001d:
            n7d r2 = new n7d
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r0 = 8
            long r4 = (long) r0
            int r0 = defpackage.i8a.D0
            hge r7 = new hge
            r7.<init>(r0)
            int r0 = defpackage.i8a.A0
            hge r9 = new hge
            r9.<init>(r0)
            o7d r0 = new o7d
            r14 = 0
            r15 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 1864(0x748, float:2.612E-42)
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.setModelItem(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axa.<init>(android.content.Context, int):void");
    }
}
