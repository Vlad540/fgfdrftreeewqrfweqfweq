package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: bx3  reason: default package */
public final class bx3 extends ContentObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx3(voa voa, Handler handler) {
        super(handler);
        this.b = voa;
    }

    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            case 2:
                return false;
            default:
                return super.deliverSelfNotifications();
        }
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        Object value;
        switch (this.a) {
            case 0:
                dx3 dx3 = (dx3) this.b;
                if (dx3.b && (cursor = dx3.c) != null && !cursor.isClosed()) {
                    dx3.a = dx3.c.requery();
                    return;
                }
                return;
            case 1:
                udd.p(bv6.I0, "ContentObserver: on content changed", new Object[0]);
                ((bv6) this.b).e();
                return;
            default:
                udd.p("Phonebook", "contact observer onChange", new Object[0]);
                voa voa = (voa) this.b;
                grd grd = voa.x0;
                do {
                    value = grd.getValue();
                    ((Number) value).intValue();
                } while (!grd.b(value, Integer.valueOf(voa.w0.incrementAndGet())));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx3(dx3 dx3) {
        super(new Handler());
        this.b = dx3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bx3(bv6 bv6) {
        super((Handler) null);
        this.b = bv6;
    }
}
