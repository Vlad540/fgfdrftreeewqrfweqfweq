package defpackage;

import android.content.Context;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: r0a  reason: default package */
public final /* synthetic */ class r0a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ OneMeButton c;

    public /* synthetic */ r0a(Context context, OneMeButton oneMeButton, int i) {
        this.a = i;
        this.b = context;
        this.c = oneMeButton;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [a9a, android.view.View, java.lang.Object] */
    public final Object invoke() {
        OneMeButton oneMeButton = this.c;
        Context context = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = OneMeButton.F0;
                ? a9a = new a9a(context);
                a9a.setId(qhc.h);
                oneMeButton.setGravity(17);
                afa.a(a9a, new vp6(18, a9a, oneMeButton));
                ek8.d(oneMeButton, a9a, Integer.valueOf(oneMeButton.getChildCount()));
                return a9a;
            default:
                k77[] k77Arr2 = OneMeButton.F0;
                t3a t3a = new t3a(context);
                int i = qhc.f;
                t3a.setId(i);
                oneMeButton.addView(t3a, oneMeButton.b(i));
                return t3a;
        }
    }
}
