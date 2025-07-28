package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.leolin.shortcutbadger.BuildConfig;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: sq1  reason: default package */
public final /* synthetic */ class sq1 implements tn1, bid, kh7, of3, m48, le8, ou9, yx7, vic, h73 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sq1(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public void accept(Object obj) {
        long j = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 3:
                udd.p("cl7", "validateThumbnailUri: id = %d, result = %s, uri = %s", Long.valueOf(j), (Boolean) obj, (String) obj2);
                return;
            default:
                int i = VideoPlayerSeekBarPreview.I0;
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = (VideoPlayerSeekBarPreview) obj2;
                videoPlayerSeekBarPreview.getClass();
                Locale locale = Locale.ENGLISH;
                udd.s("ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview", "Can't extract frame millis = " + j, (Throwable) obj);
                tic.b(videoPlayerSeekBarPreview.y0);
                videoPlayerSeekBarPreview.c.a(false);
                return;
        }
    }

    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        hb0 hb0 = (hb0) this.c;
        String str = hb0.a;
        t3b t3b = hb0.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(w3b.a(t3b))}) < 1) {
            contentValues.put("backend_name", hb0.a);
            contentValues.put("priority", Integer.valueOf(w3b.a(t3b)));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    public void b(x63 x63) {
        bye bye = (bye) this.c;
        long j = this.b;
        bye.getClass();
        udd.p("bye", "removeUploadWithAttachId: attachId=" + j, new Object[0]);
        synchronized (bye) {
            bye.a.b(j).e(((zxe) bye.b.getValue()).b(j)).a();
        }
        if (!x63.h()) {
            x63.b();
        }
    }

    public void c(ex7 ex7) {
        xx xxVar;
        q8c q8c = (q8c) this.c;
        jj0 jj0 = q8c.e;
        if (jj0 != null && (xxVar = jj0.f) != null) {
            ur6 d = ur6.d(Uri.parse((String) xxVar.Y));
            d.l = new ez5(q8c.e, this.b);
            g0 a2 = q8c.f.a(d.a(), (Object) null);
            q8c.h = a2;
            a2.m(new p8c(ex7), xn1.a);
        } else if (!ex7.h()) {
            ex7.onError(new IllegalStateException("Video content or collage is null"));
        }
    }

    public void d(at9 at9) {
        Bitmap bitmap;
        int i = 0;
        while (true) {
            RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) this.c;
            if (((float) i) >= rangeSeekBarView.Q0 + 2.0f || at9.h()) {
                at9.b();
            } else {
                long j = (((long) i) * rangeSeekBarView.R0) + this.b;
                if (rangeSeekBarView.K0.get(j) == null) {
                    FrgTrimVideo frgTrimVideo = rangeSeekBarView.M0;
                    int i2 = rangeSeekBarView.P0;
                    if (frgTrimVideo.F1 == null) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        frgTrimVideo.F1 = mediaMetadataRetriever;
                        mediaMetadataRetriever.setDataSource(frgTrimVideo.e0(), frgTrimVideo.H1);
                    }
                    Bitmap frameAtTime = frgTrimVideo.F1.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(j), 2);
                    if (frameAtTime == null) {
                        bitmap = null;
                    } else {
                        int min = Math.min(frameAtTime.getWidth(), frameAtTime.getHeight());
                        int width = (frameAtTime.getWidth() - min) / 2;
                        int height = (frameAtTime.getHeight() - min) / 2;
                        Rect rect = new Rect(width, height, width + min, min + height);
                        bitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(frameAtTime, rect.left, rect.top, rect.width(), rect.height()), i2, i2, true);
                    }
                    if (bitmap != null) {
                        at9.c(new yia(Long.valueOf(j), bitmap));
                    }
                }
                i++;
            }
        }
        at9.b();
    }

    public void f(nn6 nn6, int i) {
        nn6.X(((o48) this.c).c, i, this.b);
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        return cd8.q(ic8, ws6.n((l68) this.c), 0, this.b);
    }

    public void invoke(Object obj) {
        p98 p98;
        n35 n35 = (n35) obj;
        n35.getClass();
        n35.u();
        Object obj2 = this.c;
        udd.p("n35", "videoDebugListener.onRenderedFirstFrame: output = %s renderTimeMs = %d", obj2 != null ? obj2.toString() : BuildConfig.FLAVOR, Long.valueOf(this.b));
        al7 al7 = n35.Y;
        if (al7 != null && (p98 = al7.e) != null) {
            p98.i0();
        }
    }

    public void j(ihd ihd) {
        bd2 bd2 = (bd2) this.c;
        vo8 q = bd2.r.q(this.b);
        if (q != null) {
            bd2.t.e(q);
            rp8 rp8 = bd2.u;
            rp8.getClass();
            ihd.a(rp8.a(rp8, q));
        }
    }

    public String z(sn1 sn1) {
        zq1 zq1 = (zq1) this.c;
        zq1.getClass();
        long j = this.b;
        zq1.p(new tq1(j, sn1));
        return "waitForSessionUpdateId:" + j;
    }

    public /* synthetic */ sq1(fd fdVar, Object obj, long j) {
        this.a = 2;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ sq1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
