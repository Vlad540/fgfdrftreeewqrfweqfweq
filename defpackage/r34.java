package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.List;
import javax.inject.Provider;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable;
import ru.ok.android.externcalls.sdk.utils.cancelable.DisposableCancelableKt;

/* renamed from: r34  reason: default package */
public final /* synthetic */ class r34 implements kh7, of3, ub4, h4f, Cancelable, j26, ar7, Provider, Uploader.IdleStateProvider, lh7, cy, gl0, hl0, tn1, otc, e26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r34(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public long a(long j) {
        switch (this.a) {
            case 25:
                ti5 ti5 = (ti5) this.b;
                return mze.k((j * ((long) ti5.f)) / 1000000, 0, ti5.k - 1);
            default:
                ti5 ti52 = (ti5) this.b;
                return oze.k((j * ((long) ti52.f)) / 1000000, 0, ti52.k - 1);
        }
    }

    public void accept(Object obj) {
        pib pib = (pib) obj;
        aa4 aa4 = (aa4) this.b;
        aa4.getClass();
        udd.p("aa4", "success connect to host: %s", pib.f.toString());
        aa4.l(pib);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return new au4(((au4) this.b).b, (List) obj);
            case 9:
                return ((nu4) this.b).e((CharSequence) obj);
            default:
                moe moe = (moe) obj;
                ((my5) this.b).getClass();
                return moe;
        }
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        pqe pqe = (pqe) ((gvf) this.b).b;
        pqe.getClass();
        pqe.Y.execute(new zo5(pqe, 29, videoFrameProcessingException));
    }

    public void cancel() {
        DisposableCancelableKt.a((xi4) this.b);
    }

    public void d(String str, Throwable th) {
        udd.s(((f3) ((ue5) this.b).b.a).e, str, th);
    }

    public void e() {
        OneMeDraweeView oneMeDraweeView = ((ev4) this.b).K0;
        if (oneMeDraweeView != null) {
            oneMeDraweeView.setVisibility(8);
        }
    }

    public Object get() {
        return ((Uploader) this.b).getSink();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [op5, ig7] */
    public int i(int i) {
        int l = ((pg7) ((FolderEditScreen) this.b).X.C(i)).l();
        if ((536870911 & l) == 8) {
            return 0;
        }
        if ((536870912 & l) != 0) {
            return 1;
        }
        if ((1073741824 & l) != 0) {
            return 2;
        }
        return (l & Integer.MIN_VALUE) != 0 ? 3 : 4;
    }

    public void invoke(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((n35) obj).getClass();
                udd.s("n35", "onPlayerError", (PlaybackException) obj2);
                return;
            case 14:
                ((gya) obj).q((y78) obj2);
                return;
            case 15:
                ((hya) obj).S((vw3) obj2);
                return;
            case 16:
                ((gya) obj).q(((g45) obj2).a.Z0);
                return;
            case 17:
                ((hya) obj).b0(((h45) obj2).a.c1);
                return;
            case 18:
                ((gya) obj).s((y29) obj2);
                return;
            case 19:
                ((hya) obj).s0((a39) obj2);
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                ((gya) obj).o((sf4) obj2);
                return;
            case 21:
                ((hya) obj).w((r8f) obj2);
                return;
            default:
                ((ig8) obj).getClass();
                l68 l68 = ((gs4) ((hs4) ((j93) ((s39) obj2).a).a.get(0)).a.get(0)).a;
                return;
        }
    }

    public boolean isIdle() {
        return ((EventQueueCollector.IdleStateProvider) this.b).isIdle();
    }

    public e8c m(int i, uoe uoe, int[] iArr) {
        ts6 i2 = ws6.i();
        for (int i3 = 0; i3 < uoe.a; i3++) {
            int i4 = i;
            uoe uoe2 = uoe;
            int i5 = i3;
            i2.a(new ib4(i4, uoe2, i5, (nb4) this.b, iArr[i3]));
        }
        return i2.j();
    }

    public String z(sn1 sn1) {
        bp5 bp5 = (bp5) this.b;
        bp5.getClass();
        bp5.b.execute(new zo5(bp5, 0, sn1));
        return "triggerAePrecapture";
    }

    public /* synthetic */ r34(fd fdVar, PlaybackException playbackException) {
        this.a = 0;
        this.b = playbackException;
    }

    public /* synthetic */ r34(s39 s39, iqe iqe) {
        this.a = 23;
        this.b = s39;
    }
}
