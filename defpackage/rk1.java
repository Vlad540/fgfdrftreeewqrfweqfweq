package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: rk1  reason: default package */
public final class rk1 {
    public final otf a;
    public final bae b;
    public final mk9 c;
    public final ea6 d;
    public final otf e;
    public final stf f;
    public final j8e g;
    public final ok1 h;
    public final ew i;
    public final x41 j;
    public volatile boolean k;
    public final tz0 l;
    public final u7 m;

    /* JADX WARNING: type inference failed for: r3v4, types: [j8e, java.lang.Object] */
    public rk1(Context context, otf otf, fje fje, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, xwb xwb, mw0 mw0, dt3 dt3) {
        otf otf2 = otf;
        fje fje2 = fje;
        ConnectivityManager connectivityManager2 = connectivityManager;
        TelephonyManager telephonyManager2 = telephonyManager;
        xwb xwb2 = xwb;
        this.a = otf2;
        bae bae = new bae(1, mw0);
        this.b = bae;
        mk9 mk9 = new mk9(8);
        this.c = mk9;
        ea6 ea6 = new ea6(10, dt3);
        this.d = ea6;
        otf otf3 = new otf(connectivityManager2, telephonyManager2);
        this.e = otf3;
        this.f = new stf(otf, connectivityManager2, telephonyManager2, xwb2);
        ? obj = new Object();
        obj.a = otf2;
        obj.b = connectivityManager2;
        obj.c = telephonyManager2;
        obj.o = new Object();
        this.g = obj;
        this.h = new ok1(otf, xwb, bae, mk9, ea6, otf3, fje);
        ew ewVar = new ew();
        this.i = ewVar;
        CallAnalyticsSender callAnalyticsSender = (CallAnalyticsSender) otf2.b;
        x41 x41 = new x41(callAnalyticsSender, fje2);
        this.j = x41;
        Context context2 = context;
        this.l = new tz0(callAnalyticsSender, new ez2(context, xwb2, fje2), fje2);
        this.m = new u7(x41, fje2);
        c97 c97 = (c97) ewVar.c;
        if (c97 != null) {
            bj4.a(c97);
        }
        ewVar.c = ms9.k(MultiFileUploader.UPLOAD_NEXT_INTERVAL, MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, cnc.b()).p(new vbe(ewVar));
    }
}
