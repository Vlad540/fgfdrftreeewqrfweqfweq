package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: b52  reason: default package */
public final /* synthetic */ class b52 implements of3, r3e, lh7, tn1, bid, m48, vic, l7e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ b52(bp5 bp5, ws4 ws4) {
        this.a = 5;
        this.b = bp5;
        this.o = ws4;
        this.c = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
    }

    public Object a() {
        vxe vxe = (vxe) this.b;
        xic xic = vxe.c;
        xic.getClass();
        xic.o(new sq1(vxe.g.a() + this.c, (hb0) this.o, 8));
        return null;
    }

    public void accept(Object obj) {
        av7 av7;
        Object obj2 = this.o;
        long j = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                y52 y52 = (y52) obj;
                t52 t52 = (t52) obj3;
                t52.getClass();
                y52.f0 = (j4a) obj2;
                y52.g0 = j;
                y52.h0 = ((j2b) t52.n).a.m();
                return;
            case 1:
                y52 y522 = (y52) obj;
                t52 t522 = (t52) obj3;
                t522.getClass();
                vo8 vo8 = (vo8) obj2;
                if (vo8 == null) {
                    y522.k0 = 0;
                    return;
                }
                vo8 j2 = ((to8) t522.s.get()).j(j, y522.k0);
                if (j2 == null || vo8.o > j2.o) {
                    y522.k0 = vo8.c;
                    return;
                }
                return;
            case 3:
                gi3 gi3 = (gi3) obj;
                gi3.b = (String) obj3;
                gi3.c = (String) obj2;
                gi3.e = j;
                return;
            default:
                List list = (List) obj;
                be9 be9 = (be9) obj3;
                be9.getClass();
                udd.p("be9", "Update track for message %d: track length = %d", new Object[]{Long.valueOf(j), Integer.valueOf(list.size())});
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (true) {
                    av7 av72 = (av7) obj2;
                    if (it.hasNext()) {
                        am3 am3 = (am3) it.next();
                        zu7 zu7 = new zu7(am3.c);
                        zu7.b = am3.a;
                        zu7.j = am3.b;
                        zu7.k = av72.k;
                        zu7.c = j;
                        zu7.l = am3.d;
                        arrayList.add(new av7(zu7));
                    } else {
                        be9.o.put(Long.valueOf(j), arrayList);
                        ((af9) ((ge9) be9.b)).C(arrayList, av72.k);
                        hm7 hm7 = be9.G0;
                        if (hm7.o != -1 && (av7 = (av7) be9.c.get(Long.valueOf(hm7.h))) != null) {
                            be9.L0.c(av7);
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }

    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        qn7 qn7 = (qn7) this.o;
        String num = Integer.toString(qn7.a);
        String str = (String) this.b;
        boolean booleanValue = ((Boolean) xic.n0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num}), new lpa(19))).booleanValue();
        long j = this.c;
        int i = qn7.a;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL(us8.j(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
        }
        return null;
    }

    public void f(nn6 nn6, int i) {
        o48 o48 = (o48) this.b;
        o48.getClass();
        nn6 nn62 = nn6;
        int i2 = i;
        nn62.i(o48.c, i2, ((l68) this.o).d(true), this.c);
    }

    public Object get() {
        t52 t52 = (t52) this.b;
        long j = this.c;
        i22 B = t52.B(j);
        if (B == null) {
            udd.q("t52", "changeChatField: chat with id = " + j + " not found");
            return null;
        }
        ((qf3) this.o).accept(B);
        p62 z = t52.z(j);
        o62 o62 = B.b;
        t52.U(j, z != null ? new p62(z.b, o62) : new p62(j, o62));
        t52.f0((String) null, new a52(t52, j, B, false));
        ((hz3) ((a04) t52.l.get())).b.g(B.a, o62);
        return B;
    }

    public void invoke(Object obj) {
        ((hd) obj).e0((gd) this.b, this.o, this.c);
    }

    public void j(ihd ihd) {
        int i;
        boolean z;
        Bitmap bitmap;
        FrgTrimVideo frgTrimVideo = (FrgTrimVideo) this.b;
        o2a o2a = (k93) frgTrimVideo.t1.b;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(vl.o, Uri.parse((String) this.o));
        try {
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            z = true;
        } catch (Exception e) {
            udd.s("ru.ok.messages.media.trim.FrgTrimVideo", "Can't extract video rotation", e);
            z = false;
            i = 0;
        }
        long j = this.c;
        if (z) {
            tf4 f = o2a.f();
            Context e0 = frgTrimVideo.e0();
            f.getClass();
            Size i2 = tf4.i(e0);
            if (i == 0 || i == 180) {
                i2 = new Size(i2.getHeight(), i2.getWidth());
            }
            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j * 1000, 1, i2.getWidth(), i2.getHeight());
        } else {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j * 1000, 1);
        }
        mg5 h = o2a.h();
        h.getClass();
        String path = h.o((String) null, (String) null).getPath();
        at7.M(path, bitmap, 90);
        ihd.a(path);
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 5:
                bp5 bp5 = (bp5) this.b;
                bp5.getClass();
                bp5.b.execute(new wo5(bp5, sn1, (ws4) this.o, this.c, 0));
                return "startFocusAndMetering";
            default:
                ch7 ch7 = (ch7) this.b;
                ct0.C(ch7, sn1);
                if (!ch7.isDone()) {
                    long j = this.c;
                    ch7.c(new m36(((ScheduledExecutorService) this.o).schedule(new l36(sn1, ch7, j), j, TimeUnit.MILLISECONDS), 0), pa2.j());
                }
                return "TimeoutFuture[" + ch7 + "]";
        }
    }

    public /* synthetic */ b52(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
        this.o = obj2;
    }

    public /* synthetic */ b52(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.b = obj;
        this.o = obj2;
        this.c = j;
    }
}
