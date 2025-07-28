package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: lpa  reason: default package */
public final /* synthetic */ class lpa implements nbc, j75, k75, of3, kt0, j26, vic, nf3, rnc, v1b {
    public final /* synthetic */ int a;

    public /* synthetic */ lpa(int i) {
        this.a = i;
    }

    public d75[] a() {
        return new d75[]{new uib()};
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                int i = RangeSeekBarView.U0;
                udd.s("ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView", "TimeLineView error occurred", (Throwable) obj);
                return;
            case 11:
                udd.s("i2c", "clearRecentSearch: failed", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                udd.s("tic", "async failed", (Throwable) obj);
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                wwc wwc = tic.a;
                return;
            case LangUtils.HASH_SEED /*17*/:
                Throwable th = (Throwable) obj;
                udd.s("at7", th.getMessage(), th);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                ((rjc) obj).b.release();
                return;
            case 21:
                ((sjc) obj).b.release();
                return;
            case 27:
                ((m00) obj).k = -1.0f;
                return;
            default:
                m00 m00 = (m00) obj;
                m00.i = g10.X;
                m00.k = -1.0f;
                return;
        }
    }

    public Object apply(Object obj) {
        Object utd;
        boolean z = false;
        switch (this.a) {
            case 5:
                return Long.valueOf(((tf3) obj).n());
            case 6:
                return new o2c((i22) obj, (tf3) null);
            case 7:
                return ms9.j(((i22) obj).i());
            case 8:
                return new o2c((i22) null, (tf3) obj);
            case 9:
                return ms9.j(((i22) obj).i());
            case 10:
                o2c o2c = (o2c) obj;
                i22 i22 = o2c.a;
                tf3 tf3 = o2c.b;
                return tf3 != null ? new prc(4, (String) null, Collections.emptyList(), (i22) null, tf3, (ym8) null, 0, (yib) null) : i22.G() ? new prc(2, (String) null, Collections.emptyList(), i22, (tf3) null, (ym8) null, 0, (yib) null) : new prc(1, (String) null, Collections.emptyList(), i22, (tf3) null, (ym8) null, 0, (yib) null);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                c2c c2c = (c2c) obj;
                int ordinal = c2c.b.ordinal();
                if (ordinal == 1) {
                    return new vu4(c2c.f.a);
                }
                if (ordinal == 2) {
                    utd = new utd(c2c.e.a, c2c.d);
                } else if (ordinal == 3) {
                    try {
                        utd = new c96(b.m(Protos.Attaches.Attach.Photo.parseFrom((byte[]) c2c.g.c)), c2c.d);
                    } catch (InvalidProtocolBufferNanoException e) {
                        udd.s("j2c", "Can't parse gif", e);
                        return new oi();
                    }
                } else if (ordinal == 4) {
                    return new oi(c2c.d);
                } else {
                    Locale locale = Locale.ENGLISH;
                    udd.r("j2c", "Unknown recentDb type " + c2c.c);
                    return new oi();
                }
                return utd;
            case 13:
                return ((OneMeRoomDatabase) obj).L();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                b2c b2c = (b2c) obj;
                b2c.getClass();
                return new y63(2, new g74(11, b2c));
            case 18:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        ydc a2 = hb0.a();
                        a2.I(rawQuery.getString(1));
                        a2.o = w3b.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a2.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a2.r());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 19:
                if (((Cursor) obj).getCount() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                return ((ii3) obj).a();
            default:
                return Long.valueOf(((osd) obj).a);
        }
    }

    public lt0 e(Bundle bundle) {
        jma kf6;
        uod jma;
        switch (this.a) {
            case 4:
                boolean z = false;
                int i = bundle.getInt(Integer.toString(0, 36), -1);
                if (i != 0) {
                    if (i == 1) {
                        if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                            z = true;
                        }
                        swb.e(z);
                        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                        if (f == -1.0f) {
                            kf6 = new jma();
                        } else {
                            jma = new jma(f);
                        }
                    } else if (i == 2) {
                        if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
                            z = true;
                        }
                        swb.e(z);
                        int i2 = bundle.getInt(Integer.toString(1, 36), 5);
                        float f2 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                        if (f2 != -1.0f) {
                            return new uod(i2, f2);
                        }
                        jma = new uod(i2);
                    } else if (i == 3) {
                        swb.e(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                        return bundle.getBoolean(Integer.toString(1, 36), false) ? new tie(bundle.getBoolean(Integer.toString(2, 36), false)) : new tie();
                    } else {
                        throw new IllegalArgumentException(m4b.h(31, i, "Unknown RatingType: "));
                    }
                    return jma;
                }
                swb.e(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new kf6(bundle.getBoolean(Integer.toString(2, 36), false));
                }
                kf6 = new kf6();
                return kf6;
            default:
                boolean z2 = false;
                if (bundle.getInt(Integer.toString(0, 36), -1) == 2) {
                    z2 = true;
                }
                swb.e(z2);
                int i3 = bundle.getInt(Integer.toString(1, 36), 5);
                float f3 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f3 == -1.0f ? new uod(i3) : new uod(i3, f3);
        }
    }

    public void g(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public void l() {
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 24:
                return !r1g.p((String) obj);
            default:
                j10 j10 = ((o10) obj).a;
                return j10 == j10.c || j10 == j10.o;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public e75[] m5a() {
        return new e75[]{new vib()};
    }
}
