package defpackage;

import android.content.Context;
import android.location.Geocoder;
import android.util.Size;
import java.util.Locale;

/* renamed from: nd  reason: default package */
public final /* synthetic */ class nd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ nd(t97 t97, Context context, int i) {
        this.a = i;
        this.b = t97;
        this.c = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Geocoder(this.c, (Locale) this.b.getValue());
            case 1:
                ((tf4) this.b.getValue()).getClass();
                Size i = tf4.i(this.c);
                return Integer.valueOf(Math.max(i.getWidth(), i.getHeight()));
            case 2:
                ((tf4) this.b.getValue()).getClass();
                Size i2 = tf4.i(this.c);
                int min = (int) ((Math.min((double) i2.getWidth(), (double) i2.getHeight()) / ((double) 3.0f)) * ((double) 2.0f));
                if (min < 400) {
                    min = 400;
                }
                return Integer.valueOf(min);
            default:
                ((tf4) this.b.getValue()).getClass();
                Size i3 = tf4.i(this.c);
                return Integer.valueOf(Math.max(i3.getWidth(), i3.getHeight()));
        }
    }

    public /* synthetic */ nd(Context context, r7e r7e) {
        this.a = 0;
        this.c = context;
        this.b = r7e;
    }
}
