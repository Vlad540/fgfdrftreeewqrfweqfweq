package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.messages.settings.FrgMediaSettings;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: hy5  reason: default package */
public final /* synthetic */ class hy5 implements e26, igb, uw9, of3, cr3, x1b, bid, tn1, ou9, v1b, ar7, d38, e38, y48, r3e, le8, nf3, je8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public nsf M(View view, nsf nsf) {
        int i;
        FrgLocalVideo frgLocalVideo = (FrgLocalVideo) this.b;
        ActLocalMedias c0 = frgLocalVideo.c0();
        if (c0 == null) {
            i = 0;
        } else {
            int a2 = dh4.a(c0);
            if (c0 instanceof ActLocalMedias) {
                ActLocalMedias actLocalMedias = c0;
                ze9 ze9 = actLocalMedias.n1;
                if (ze9 != null) {
                    i = actLocalMedias.j1.getContentHeight() + ((View) ze9.c).getHeight();
                } else {
                    i = actLocalMedias.j1.getContentHeight();
                }
            } else {
                i = a2;
            }
        }
        Rect rect = new Rect(nsf.b(), nsf.d(), nsf.c(), i);
        se9 se9 = frgLocalVideo.N1;
        if (se9 != null) {
            se9.A(rect);
        }
        return nsf;
    }

    public int a(Object obj) {
        switch (this.a) {
            case 17:
                try {
                    return ((o28) obj).c((vu5) this.b) ? 1 : 0;
                } catch (MediaCodecUtil$DecoderQueryException unused) {
                    return -1;
                }
            default:
                p28 p28 = (p28) obj;
                p28.getClass();
                xu5 xu5 = (xu5) this.b;
                String str = xu5.n;
                String str2 = p28.b;
                return (!(str2.equals(str) || str2.equals(g38.b(xu5))) || !p28.c(xu5, false)) ? 0 : 1;
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [n83, java.lang.Object] */
    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 3:
                xi4 xi4 = (xi4) obj;
                FrgMediaSettings frgMediaSettings = (FrgMediaSettings) obj2;
                if (frgMediaSettings.C1 == null) {
                    frgMediaSettings.C1 = new Object();
                }
                frgMediaSettings.C1.a(xi4);
                return;
            case 10:
                ((jk0) obj2).c((List) obj);
                return;
            case 11:
                udd.u("cl7", (Throwable) obj, "loadThumbnail: %d, thumbnailUri validate error", Long.valueOf(((cl7) obj2).X.b));
                return;
            case 23:
                ((qza) obj).m((Surface) obj2);
                return;
            case 26:
                ((mn8) obj2).L(((Integer) obj).intValue());
                return;
            case 28:
                p10 p10 = (p10) obj;
                vw6 vw6 = p10.b;
                if (vw6 != null) {
                    uw6 uw6 = new uw6();
                    uw6.a = vw6.a;
                    uw6.b = vw6.b;
                    ((of3) obj2).accept(uw6);
                    p10.b = new vw6(uw6);
                    return;
                }
                return;
            default:
                p10 p102 = (p10) obj;
                long m = ((to8) obj2).c.a.m();
                for (int i = 0; i < p102.b(); i++) {
                    urd.N(p102, p102.d(i).q, new f00(m, 0));
                }
                return;
        }
    }

    public Object apply(Object obj) {
        noe noe = (noe) obj;
        ((ny5) this.b).getClass();
        return noe;
    }

    public void b() {
        j8e j8e = ((FrgAttachPhoto) this.b).Q1;
        if (j8e != null) {
            tic.b((c97) j8e.o);
            for (oy a2 : (List) j8e.b) {
                a2.a();
            }
        }
    }

    public void c(o48 o48) {
        switch (this.a) {
            case 19:
                nn6 nn6 = o48.w;
                r38 r38 = o48.a;
                if (nn6 != null) {
                    ez3.A("Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    r38.release();
                    return;
                }
                sd3 sd3 = (sd3) this.b;
                o48.w = sd3.c;
                o48.q = sd3.e;
                eya eya = sd3.f;
                o48.r = eya;
                eya eya2 = sd3.g;
                o48.s = eya2;
                eya i = o48.i(eya, eya2);
                o48.t = i;
                ws6 ws6 = sd3.k;
                o48.o = ws6;
                o48.p = t33.a(ws6, o48.q, i);
                o48.n = sd3.j;
                try {
                    sd3.c.asBinder().linkToDeath(o48.g, 0);
                    m3d m3d = o48.e;
                    o48.k = new m3d(m3d.a.a(), sd3.a, sd3.b, m3d.a.getPackageName(), sd3.c, sd3.h);
                    r38.j();
                    return;
                } catch (RemoteException unused) {
                    r38.release();
                    return;
                }
            default:
                if (o48.isConnected() && o48.j.isEmpty()) {
                    n2d n2d = o48.n.c;
                    long j = n2d.c;
                    n2d n2d2 = (n2d) this.b;
                    if (j < n2d2.c && am7.b(n2d2, n2d)) {
                        o48.n = o48.n.j(n2d2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void d(at9 at9) {
        kk7 kk7 = (kk7) this.b;
        u2f u2f = kk7.e;
        if (u2f != null) {
            kk7.h.setDataSource(u2f.l().getPath());
            try {
                kk7.j = Long.parseLong(kk7.h.extractMetadata(9));
            } catch (Exception e) {
                udd.s("kk7", "Can'e extract duration", e);
                kk7.j = kk7.e.a;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < kk7.i && !at9.h(); i++) {
                Bitmap scaledFrameAtTime = kk7.h.getScaledFrameAtTime((kk7.j / ((long) kk7.i)) * ((long) i) * 1000, 2, kk7.c, kk7.d);
                if (!at9.h()) {
                    arrayList.add(scaledFrameAtTime);
                    at9.c(arrayList);
                }
            }
        } else if (!at9.h()) {
            IllegalStateException illegalStateException = new IllegalStateException("Video content can't be null");
            if (!at9.e(illegalStateException)) {
                xs7.F(illegalStateException);
            }
        }
    }

    public void e() {
        gr7 gr7 = (gr7) this.b;
        ((OneMeDraweeView) gr7.a.b).setVisibility(8);
        if (gr7.c) {
            gr7.o = true;
        }
    }

    public boolean f(mv4 mv4, int i, Bundle bundle) {
        nfc nfc;
        Object obj = this.b;
        switch (this.a) {
            case 6:
                if ((i & 1) != 0) {
                    try {
                        ((lv1) mv4.b).H();
                        InputContentInfo inputContentInfo = (InputContentInfo) ((lv1) mv4.b).b;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                    } catch (Exception unused) {
                        return false;
                    }
                }
                ClipDescription description = ((InputContentInfo) ((lv1) mv4.b).b).getDescription();
                lv1 lv1 = (lv1) mv4.b;
                ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) lv1.b).getContentUri()));
                if (Build.VERSION.SDK_INT >= 31) {
                    nfc = new nfc(clipData, 2);
                } else {
                    vp3 vp3 = new vp3();
                    vp3.b = clipData;
                    vp3.c = 2;
                    nfc = vp3;
                }
                nfc.c(((InputContentInfo) lv1.b).getLinkUri());
                nfc.setExtras(bundle);
                return eaf.g((View) obj, nfc.build()) == null;
            default:
                int i2 = MessageComposeEditText.A0;
                ((MessageComposeEditText) obj).getClass();
                return false;
        }
    }

    public void g(qza qza, ic8 ic8) {
        ((nf3) this.b).accept(qza);
    }

    public Object get() {
        s98 s98 = (s98) this.b;
        s98.getClass();
        return s98.m(t98.o, new z40(true, false, true));
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        Object obj = this.b;
        switch (this.a) {
            case 22:
                return cd8.k(ic8, (e8c) ((ws6) obj));
            default:
                bs6 bs6 = bs6.b;
                if (!cd8.i()) {
                    ((je8) obj).g(cd8.s, ic8);
                    me8.M0(ic8, i, new p2d(0));
                }
                return bs6.b;
        }
    }

    public void j(ihd ihd) {
        vy6 vy6 = (vy6) this.b;
        vy6.getClass();
        ArrayList arrayList = new ArrayList();
        vb5 c = vy6.c("https://www.instagram.com/p/%s/", ihd);
        if (c == null) {
            c = vy6.c("https://www.instagram.com/p/%s/embed/", ihd);
        }
        if (c != null) {
            arrayList.add(c);
        }
        if (ihd.h()) {
            return;
        }
        if (arrayList.isEmpty()) {
            ihd.onError(new FetcherException(4, "Failed to fetch instagram video"));
        } else {
            ihd.a(new xb5("Instagram", arrayList));
        }
    }

    public Object l(Task task) {
        Object obj;
        ((mif) this.b).getClass();
        Class<IOException> cls = IOException.class;
        n6g n6g = (n6g) task;
        synchronized (n6g.a) {
            a24.q("Task is not yet complete", n6g.c);
            if (n6g.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(n6g.f)) {
                Exception exc = n6g.f;
                if (exc == null) {
                    obj = n6g.e;
                } else {
                    throw new RuntimeException(exc);
                }
            } else {
                throw cls.cast(n6g.f);
            }
        }
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public boolean test(Object obj) {
        return ((Locale) obj).getLanguage().equals(((Locale) this.b).getLanguage());
    }

    public String z(sn1 sn1) {
        b2b b2b = (b2b) this.b;
        b2b.getClass();
        pa2.A().execute(new zo5(b2b, 12, sn1));
        return b2b + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m19apply(Object obj) {
        return ((ov0) obj).a((Uri) this.b);
    }
}
