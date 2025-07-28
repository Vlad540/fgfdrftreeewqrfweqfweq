package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: rb0  reason: default package */
public final /* synthetic */ class rb0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pda b;

    public /* synthetic */ rb0(int i, pda pda) {
        this.a = i;
        this.b = pda;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(this.b.b().j);
                return paint;
            default:
                Paint paint2 = new Paint();
                this.b.getText();
                paint2.setColor(-1);
                paint2.setAntiAlias(true);
                paint2.setDither(true);
                paint2.setSubpixelText(true);
                paint2.setLinearText(true);
                paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 600, false));
                return paint2;
        }
    }
}
