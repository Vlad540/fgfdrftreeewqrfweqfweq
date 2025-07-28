package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: xya  reason: default package */
public final class xya implements Handler.Callback {
    public boolean X;
    public boolean Y;
    public final Object Z;
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final TreeMap c;
    public boolean o;
    public final Object w0;
    public final Object x0;
    public Object y0;

    public xya(dy3 dy3, c9 c9Var, l34 l34) {
        this.y0 = dy3;
        this.w0 = c9Var;
        this.Z = l34;
        this.c = new TreeMap();
        this.b = mze.m(this);
        this.x0 = new xo(1);
    }

    public wya a() {
        return new wya(this, (l34) this.Z);
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (this.Y) {
                    return true;
                }
                if (message.what != 1) {
                    return false;
                }
                tya tya = (tya) message.obj;
                long j = tya.a;
                TreeMap treeMap = this.c;
                long j2 = tya.b;
                Long l = (Long) treeMap.get(Long.valueOf(j2));
                if (l == null) {
                    treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                    return true;
                } else if (l.longValue() <= j) {
                    return true;
                } else {
                    treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                    return true;
                }
            default:
                if (this.Y) {
                    return true;
                }
                if (message.what != 1) {
                    return false;
                }
                uya uya = (uya) message.obj;
                long j3 = uya.a;
                TreeMap treeMap2 = this.c;
                long j4 = uya.b;
                Long l2 = (Long) treeMap2.get(Long.valueOf(j4));
                if (l2 == null) {
                    treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                    return true;
                } else if (l2.longValue() <= j3) {
                    return true;
                } else {
                    treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                    return true;
                }
        }
    }

    public xya(ey3 ey3, u5g u5g, l34 l34) {
        this.y0 = ey3;
        this.w0 = u5g;
        this.Z = l34;
        this.c = new TreeMap();
        this.b = oze.o(this);
        this.x0 = new yo(1);
    }
}
