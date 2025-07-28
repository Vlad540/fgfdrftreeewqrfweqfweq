package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: vh  reason: default package */
public final class vh implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ wh c;

    public /* synthetic */ vh(wh whVar, pec pec, int i) {
        this.a = i;
        this.c = whVar;
        this.b = pec;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                aec aec = this.c.a;
                pec pec = this.b;
                Cursor o = aec.o(pec, (CancellationSignal) null);
                try {
                    int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                    int o3 = gp0.o(o, "update_time");
                    int o4 = gp0.o(o, "emoji");
                    int o5 = gp0.o(o, "lottie_url");
                    int o6 = gp0.o(o, "lottie_play_url");
                    int o7 = gp0.o(o, "set_id");
                    int o8 = gp0.o(o, "icon_url");
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        arrayList.add(new ii(o.getLong(o2), o.getLong(o3), o.isNull(o4) ? null : o.getString(o4), o.isNull(o5) ? null : o.getString(o5), o.isNull(o6) ? null : o.getString(o6), o.isNull(o7) ? null : Long.valueOf(o.getLong(o7)), o.isNull(o8) ? null : o.getString(o8)));
                    }
                    return arrayList;
                } finally {
                    o.close();
                    pec.m();
                }
            case 1:
                aec aec2 = this.c.a;
                pec pec2 = this.b;
                Cursor o9 = aec2.o(pec2, (CancellationSignal) null);
                try {
                    int o10 = gp0.o(o9, ApiProtocol.KEY_ID);
                    int o11 = gp0.o(o9, "update_time");
                    int o12 = gp0.o(o9, "emoji");
                    int o13 = gp0.o(o9, "lottie_url");
                    int o14 = gp0.o(o9, "lottie_play_url");
                    int o15 = gp0.o(o9, "set_id");
                    int o16 = gp0.o(o9, "icon_url");
                    ArrayList arrayList2 = new ArrayList(o9.getCount());
                    while (o9.moveToNext()) {
                        arrayList2.add(new ii(o9.getLong(o10), o9.getLong(o11), o9.isNull(o12) ? null : o9.getString(o12), o9.isNull(o13) ? null : o9.getString(o13), o9.isNull(o14) ? null : o9.getString(o14), o9.isNull(o15) ? null : Long.valueOf(o9.getLong(o15)), o9.isNull(o16) ? null : o9.getString(o16)));
                    }
                    return arrayList2;
                } finally {
                    o9.close();
                    pec2.m();
                }
            default:
                aec aec3 = this.c.a;
                pec pec3 = this.b;
                Integer num = null;
                Cursor o17 = aec3.o(pec3, (CancellationSignal) null);
                try {
                    if (o17.moveToFirst()) {
                        if (!o17.isNull(0)) {
                            num = Integer.valueOf(o17.getInt(0));
                        }
                    }
                    return num;
                } finally {
                    o17.close();
                    pec3.m();
                }
        }
    }
}
