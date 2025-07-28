package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import com.facebook.animated.gif.GifImage;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.richvector.VectorPath;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.RTCStats;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: xs7  reason: default package */
public abstract class xs7 {
    public static volatile of3 A;
    public static volatile j26 B;
    public static volatile j26 C;
    public static volatile j26 D;
    public static volatile Handler a;
    public static SimpleDateFormat b;
    public static final Object c = new Object();
    public static SimpleDateFormat d;
    public static final Object e = new Object();
    public static SimpleDateFormat f;
    public static final Object g = new Object();
    public static SimpleDateFormat h;
    public static final Object i = new Object();
    public static SimpleDateFormat j;
    public static final Object k = new Object();
    public static SimpleDateFormat l;
    public static final Object m = new Object();
    public static SimpleDateFormat n;
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static SimpleDateFormat q;
    public static SimpleDateFormat r;
    public static Boolean s;
    public static final Object t = new Object();
    public static SimpleDateFormat u;
    public static final Object v = new Object();
    public static final String[] w = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int[] x = {16843848};
    public static final /* synthetic */ int y = 0;
    public static volatile String z;

    public static final ac7 A(nc7 nc7) {
        ac7 ac7;
        pc7 R = nc7.R();
        loop0:
        while (true) {
            AtomicReference atomicReference = R.a;
            ac7 = (ac7) atomicReference.get();
            if (ac7 != null) {
                break;
            }
            n3e c2 = x87.c();
            ha4 ha4 = oi4.a;
            ac7 = new ac7(R, c2.plus(MainDispatcherLoader.dispatcher.getImmediate()));
            while (true) {
                if (atomicReference.compareAndSet((Object) null, ac7)) {
                    ha4 ha42 = oi4.a;
                    E(ac7, MainDispatcherLoader.dispatcher.getImmediate(), (ru3) null, new zb7(ac7, (Continuation) null), 2);
                    break loop0;
                } else if (atomicReference.get() != null) {
                }
            }
        }
        return ac7;
    }

    public static final String B() {
        String str = z;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        z = processName;
        return processName;
    }

    public static boolean C(l04 l04, l04 l042) {
        return l04.c.equals(l042.c) && l04.b.equals(l042.b) && l04.a.equals(l042.a);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [d0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.qod D(defpackage.ou3 r1, defpackage.hu3 r2, defpackage.ru3 r3, defpackage.i26 r4) {
        /*
            hu3 r1 = defpackage.xie.x(r1, r2)
            r3.getClass()
            ru3 r2 = defpackage.ru3.b
            if (r3 != r2) goto L_0x0011
            aa7 r2 = new aa7
            r2.<init>(r1, r4)
            goto L_0x0017
        L_0x0011:
            qod r2 = new qod
            r0 = 1
            r2.<init>(r1, r0, r0)
        L_0x0017:
            r2.start(r3, r2, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs7.D(ou3, hu3, ru3, i26):qod");
    }

    public static /* synthetic */ qod E(ou3 ou3, hu3 hu3, ru3 ru3, i26 i26, int i2) {
        if ((i2 & 1) != 0) {
            hu3 = bw4.a;
        }
        if ((i2 & 2) != 0) {
            ru3 = ru3.a;
        }
        return D(ou3, hu3, ru3, i26);
    }

    public static void F(Throwable th) {
        of3 of3 = A;
        if (th == null) {
            th = i15.b("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof QueueOverflowException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new IllegalStateException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        if (of3 != null) {
            try {
                of3.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static int G(byte[] bArr, int i2, int i3, boolean z2) {
        int i4;
        if (z2) {
            i2 += i3 - 1;
            i4 = -1;
        } else {
            i4 = 1;
        }
        byte b2 = 0;
        while (true) {
            int i5 = i3 - 1;
            if (i3 <= 0) {
                return b2;
            }
            b2 = (bArr[i2] & 255) | (b2 << 8);
            i2 += i4;
            i3 = i5;
        }
    }

    public static yt5 H(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), iwb.FontFamily);
                String string = obtainAttributes.getString(iwb.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(iwb.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(iwb.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(iwb.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(iwb.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(iwb.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(iwb.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), iwb.FontFamilyFont);
                                int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(iwb.FontFamilyFont_fontWeight) ? iwb.FontFamilyFont_fontWeight : iwb.FontFamilyFont_android_fontWeight, 400);
                                boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(iwb.FontFamilyFont_fontStyle) ? iwb.FontFamilyFont_fontStyle : iwb.FontFamilyFont_android_fontStyle, 0);
                                int i3 = obtainAttributes2.hasValue(iwb.FontFamilyFont_ttcIndex) ? iwb.FontFamilyFont_ttcIndex : iwb.FontFamilyFont_android_ttcIndex;
                                String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(iwb.FontFamilyFont_fontVariationSettings) ? iwb.FontFamilyFont_fontVariationSettings : iwb.FontFamilyFont_android_fontVariationSettings);
                                int i4 = obtainAttributes2.getInt(i3, 0);
                                int i5 = obtainAttributes2.hasValue(iwb.FontFamilyFont_font) ? iwb.FontFamilyFont_font : iwb.FontFamilyFont_android_font;
                                int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                                String string6 = obtainAttributes2.getString(i5);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    Q(xmlResourceParser);
                                }
                                arrayList.add(new au5(i2, i4, resourceId2, string6, string5, z2));
                            } else {
                                Q(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new zt5((au5[]) arrayList.toArray(new au5[0]));
                }
                while (xmlResourceParser.next() != 3) {
                    Q(xmlResourceParser);
                }
                return new bu5(new bd4(string, string2, string3, L(resources2, resourceId)), integer, integer2, string4);
            }
            Q(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static nfe I(int i2, yze yze, String str) {
        int h2 = yze.h();
        if (yze.h() == 1684108385 && h2 >= 22) {
            yze.I(10);
            int A2 = yze.A();
            if (A2 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(A2);
                String sb2 = sb.toString();
                int A3 = yze.A();
                if (A3 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(A3);
                    sb2 = sb3.toString();
                }
                return new nfe(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(rx.d(i2));
        if (valueOf2.length() != 0) {
            "Failed to parse index/count attribute: ".concat(valueOf2);
        }
        return null;
    }

    public static nfe J(int i2, yze yze, String str) {
        int h2 = yze.h();
        if (yze.h() == 1684108385) {
            yze.I(8);
            return new nfe(str, (String) null, yze.r(h2 - 16));
        }
        String valueOf = String.valueOf(rx.d(i2));
        if (valueOf.length() != 0) {
            "Failed to parse text attribute: ".concat(valueOf);
        }
        return null;
    }

    public static xo6 K(int i2, String str, yze yze, boolean z2, boolean z3) {
        int i3;
        yze.I(4);
        if (yze.h() == 1684108385) {
            yze.I(8);
            i3 = yze.v();
        } else {
            i3 = -1;
        }
        if (z3) {
            i3 = Math.min(1, i3);
        }
        if (i3 >= 0) {
            return z2 ? new nfe(str, (String) null, Integer.toString(i3)) : new x33("und", str, Integer.toString(i3));
        }
        String valueOf = String.valueOf(rx.d(i2));
        if (valueOf.length() != 0) {
            "Failed to parse uint8 attribute: ".concat(valueOf);
        }
        return null;
    }

    public static List L(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (xt5.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final Object M(hu3 hu3, i26 i26) {
        hu3 hu32;
        t05 t05;
        Thread currentThread = Thread.currentThread();
        cqc cqc = cqc.c;
        fr3 fr3 = (fr3) hu3.get(cqc);
        bw4 bw4 = bw4.a;
        if (fr3 == null) {
            t05 = die.a();
            hu32 = xie.p(bw4, hu3.plus(t05), true);
            ha4 ha4 = oi4.a;
            if (hu32 != ha4 && hu32.get(cqc) == null) {
                hu32 = hu32.plus(ha4);
            }
        } else {
            if (fr3 instanceof t05) {
                t05 t052 = (t05) fr3;
            }
            t05 = (t05) die.a.get();
            hu32 = xie.p(bw4, hu3, true);
            ha4 ha42 = oi4.a;
            if (hu32 != ha42 && hu32.get(cqc) == null) {
                hu32 = hu32.plus(ha42);
            }
        }
        fo0 fo0 = new fo0(hu32, currentThread, t05);
        fo0.start(ru3.a, fo0, i26);
        t05 t053 = fo0.b;
        if (t053 != null) {
            int i2 = t05.o;
            t053.S(false);
        }
        while (!Thread.interrupted()) {
            try {
                long e0 = t053 != null ? t053.e0() : Long.MAX_VALUE;
                if (!fo0.isCompleted()) {
                    LockSupport.parkNanos(fo0, e0);
                } else {
                    if (t053 != null) {
                        int i3 = t05.o;
                        t053.d(false);
                    }
                    Object a2 = j47.a(fo0.getState$kotlinx_coroutines_core());
                    r73 r73 = a2 instanceof r73 ? (r73) a2 : null;
                    if (r73 == null) {
                        return a2;
                    }
                    throw r73.a;
                }
            } catch (Throwable th) {
                if (t053 != null) {
                    int i4 = t05.o;
                    t053.d(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fo0.cancelCoroutine(interruptedException);
        throw interruptedException;
    }

    public static void O(View view, float f2) {
        int integer = view.getResources().getInteger(krb.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = (long) integer;
        stateListAnimator.addState(new int[]{16842910, wlb.state_liftable, -wlb.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j2));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f2}).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    public static final void P(s0f s0f, String str, int i2) {
        VectorPath findPath = s0f.findPath(str);
        if (findPath != null) {
            findPath.setFillColor(i2);
            s0f.invalidatePath();
        }
    }

    public static void Q(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final int R(int i2) {
        switch (hr1.t(i2)) {
            case 0:
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
                return 3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static JSONObject S(c9e c9e) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", c9e.a);
        jSONObject.put("versionCode", c9e.b);
        jSONObject.put("packageName", c9e.c);
        jSONObject.put("environment", c9e.d);
        jSONObject.put("buildUuid", c9e.e);
        jSONObject.put("sessionUuid", c9e.f);
        jSONObject.put("device", c9e.g);
        jSONObject.put("deviceId", c9e.h);
        jSONObject.put("vendor", c9e.i);
        jSONObject.put("osVersion", c9e.j);
        jSONObject.put("inBackground", c9e.k);
        jSONObject.put("isRooted", c9e.l);
        jSONObject.put("properties", new JSONObject(c9e.m));
        Set<lk6> set = c9e.n;
        if (set == null || set.isEmpty()) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            for (lk6 lk6 : set) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", lk6.a);
                jSONObject2.put("versionName", lk6.b);
                jSONObject2.put("buildUuid", lk6.c);
                jSONObject2.put("environment", lk6.d);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("hostedLibrariesInfo", jSONArray);
        return jSONObject;
    }

    public static final void T(bve bve) {
        bve.e(sw8.class, new y4(8));
        bve.e(yy.class, new y4(9));
        bve.e(wn8.class, new y4(10));
        bve.e(l3a.class, new y4(11));
        bve.e(sya.class, new cl(1));
        bve.e(lz.class, new cl(2));
        bve.e(v70.class, new cl(3));
        bve.c(pf4.class, new g(1));
        bve.e(b6f.class, new cl(4));
        bve.e(u5f.class, new cl(5));
    }

    /* JADX INFO: finally extract failed */
    public static final Object U(hu3 hu3, i26 i26, Continuation continuation) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        hu3 context = continuation.getContext();
        hu3 plus = !((Boolean) hu3.fold(Boolean.FALSE, new vg0(10))).booleanValue() ? context.plus(hu3) : xie.p(context, hu3, false);
        lp.m(plus);
        if (plus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(plus, continuation);
            return h2g.D(scopeCoroutine, scopeCoroutine, i26);
        }
        cqc cqc = cqc.c;
        if (hhd.f(plus.get(cqc), context.get(cqc))) {
            eue eue = new eue(plus, continuation);
            hu3 context2 = eue.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context2, (Object) null);
            try {
                Object D2 = h2g.D(eue, eue, i26);
                ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                return D2;
            } catch (Throwable th) {
                ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                throw th;
            }
        } else {
            ScopeCoroutine scopeCoroutine2 = new ScopeCoroutine(plus, continuation);
            vx3.K(i26, scopeCoroutine2, scopeCoroutine2);
            do {
                atomicIntegerFieldUpdater = li4.a;
                int i2 = atomicIntegerFieldUpdater.get(scopeCoroutine2);
                if (i2 != 0) {
                    if (i2 == 2) {
                        Object a2 = j47.a(scopeCoroutine2.getState$kotlinx_coroutines_core());
                        if (!(a2 instanceof r73)) {
                            return a2;
                        }
                        throw ((r73) a2).a;
                    }
                    throw new IllegalStateException("Already suspended".toString());
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(scopeCoroutine2, 0, 1));
            return pu3.a;
        }
    }

    public static us0 a(int i2, int i3, int i4) {
        us0 qc3;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    return i2 != Integer.MAX_VALUE ? i3 == 1 ? new us0(i2, (u16) null) : new qc3(i2, i3, (u16) null) : new us0(Integer.MAX_VALUE, (u16) null);
                }
                qc3 = i3 == 1 ? new us0(0, (u16) null) : new qc3(1, i3, (u16) null);
            } else if (i3 == 1) {
                return new qc3(1, 2, (u16) null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (i3 == 1) {
            i02.l.getClass();
            qc3 = new us0(h02.b, (u16) null);
        } else {
            qc3 = new qc3(1, i3, (u16) null);
        }
        return qc3;
    }

    public static Object b(RTCStats rTCStats, String str) {
        return rTCStats.getMembers().get(str);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [d0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.zc4 c(defpackage.ou3 r1, defpackage.hu3 r2, defpackage.ru3 r3, defpackage.i26 r4) {
        /*
            hu3 r1 = defpackage.xie.x(r1, r2)
            r3.getClass()
            ru3 r2 = defpackage.ru3.b
            if (r3 != r2) goto L_0x0011
            w97 r2 = new w97
            r2.<init>(r1, r4)
            goto L_0x0017
        L_0x0011:
            zc4 r2 = new zc4
            r0 = 1
            r2.<init>(r1, r0, r0)
        L_0x0017:
            r2.start(r3, r2, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs7.c(ou3, hu3, ru3, i26):zc4");
    }

    public static /* synthetic */ zc4 d(ou3 ou3, ju3 ju3, i26 i26, int i2) {
        hu3 hu3 = ju3;
        if ((i2 & 1) != 0) {
            hu3 = bw4.a;
        }
        return c(ou3, hu3, ru3.a, i26);
    }

    public static void e(String str) {
        if (mze.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void f(z03 z03, o10 o10) {
        stf stf;
        if (o10.f()) {
            File l2 = vl.b().h().l(o10.q);
            if (!l2.exists()) {
                synchronized (z03) {
                    stf = z03.o;
                }
                GifImage gifImage = (GifImage) stf.a;
                if (gifImage != null) {
                    a10 a10 = o10.b;
                    Bitmap createBitmap = Bitmap.createBitmap(a10.c, a10.o, Bitmap.Config.ARGB_8888);
                    gifImage.d(0).g(a10.c, a10.o, createBitmap);
                    at7.O(l2.getAbsolutePath(), createBitmap, vl.o.a().b);
                    createBitmap.recycle();
                }
            }
        }
    }

    public static d10 g(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new d10(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tt5 h(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            defpackage.e07.o(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0019:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L_0x0019
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L_0x0019
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0019
            goto L_0x0036
        L_0x0035:
            r3 = r4
        L_0x0036:
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r2 = r4
            goto L_0x006d
        L_0x003a:
            java.lang.String r1 = r3.authority     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.String r3 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0066 }
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch:{ NameNotFoundException -> 0x0066 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0066 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0066 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0066 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0066 }
        L_0x004c:
            if (r2 >= r6) goto L_0x005a
            r7 = r0[r2]     // Catch:{ NameNotFoundException -> 0x0066 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0066 }
            r5.add(r7)     // Catch:{ NameNotFoundException -> 0x0066 }
            int r2 = r2 + 1
            goto L_0x004c
        L_0x005a:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ NameNotFoundException -> 0x0066 }
            bd4 r2 = new bd4     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r1, r3, r5, r0)     // Catch:{ NameNotFoundException -> 0x0066 }
            goto L_0x006d
        L_0x0066:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L_0x0038
        L_0x006d:
            if (r2 != 0) goto L_0x0070
            goto L_0x007a
        L_0x0070:
            tt5 r4 = new tt5
            st5 r0 = new st5
            r0.<init>(r8, r2)
            r4.<init>(r0)
        L_0x007a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs7.h(android.content.Context):tt5");
    }

    public static String i(String str, Rect rect, xzc xzc) {
        String str2 = str;
        Rect rect2 = rect;
        Bitmap decodeFile = BitmapFactory.decodeFile(str2, (BitmapFactory.Options) null);
        if (decodeFile != null) {
            int i2 = rect2.left;
            int i3 = rect2.top;
            int width = rect.width();
            int height = rect.height();
            udd.p("xs7", "cropImage: sourceWidth=%d, sourceHeight=%d, x=%d, y=%d, width=%d, height=%d", Integer.valueOf(decodeFile.getWidth()), Integer.valueOf(decodeFile.getHeight()), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(width), Integer.valueOf(height));
            if (i2 + width > decodeFile.getWidth() || i3 + height > decodeFile.getHeight()) {
                vl.b().g().c(new Exception("wrong image crop params"), true);
            }
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, i2, i3, width, height);
            if (createBitmap != decodeFile) {
                decodeFile.recycle();
            }
            vqc vqc = (vqc) xzc;
            vqc.getClass();
            int o2 = (int) vqc.o(PmsKey.min-image-side-size, (long) 64);
            if (createBitmap.getWidth() < o2 || createBitmap.getHeight() < o2) {
                udd.s("xs7", "Crop width and height must be >= 64", (Throwable) null);
                Locale locale = Locale.ENGLISH;
                vl.b().g().c(new Exception("Crop rect = " + rect2 + " doesn't fit. Crop width and height must be >= 64"), true);
                double d2 = (double) o2;
                int max = Math.max((int) Math.ceil(d2 / ((double) createBitmap.getWidth())), (int) Math.ceil(d2 / ((double) createBitmap.getHeight())));
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, createBitmap.getWidth() * max, createBitmap.getHeight() * max, false);
                if (createScaledBitmap != createBitmap) {
                    createBitmap.recycle();
                }
                createBitmap = createScaledBitmap;
            }
            mg5 h2 = vl.b().h();
            h2.getClass();
            File o3 = h2.o((String) null, "jpg");
            at7.O(o3.getAbsolutePath(), createBitmap, vl.o.a().b);
            return o3.getAbsolutePath();
        }
        udd.s("xs7", "cropImage: failed, no file at path " + str2, (Throwable) null);
        return null;
    }

    public static void l() {
        if (mze.a >= 18) {
            Trace.endSection();
        }
    }

    public static boolean m(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static duf n(o10 o10) {
        n10 n10 = o10.d;
        String str = o10.r;
        if (n10 != null && n10.a > 0) {
            String str2 = n10.h;
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return new duf(str2);
            }
        }
        File file = !TextUtils.isEmpty(str) ? new File(str) : null;
        if (file != null) {
            boolean exists = file.exists();
            if (!exists && (n10 == null || n10.a == 0)) {
                return new duf(Boolean.TRUE);
            }
            if (exists) {
                return new duf(file);
            }
        }
        if (n10 != null) {
            File s2 = vl.b().h().s(n10.a);
            if (s2.exists()) {
                return new duf(s2);
            }
        }
        return new duf(Boolean.FALSE);
    }

    public static String o(Context context, Locale locale, long j2, long j3, boolean z2) {
        Context context2 = context;
        Locale locale2 = locale;
        long j4 = j2;
        long j5 = j3;
        long j6 = j5 - j4;
        l04 g2 = l04.g(j4, TimeZone.getDefault());
        if (j6 < 86400000) {
            return C(l04.g(j5, TimeZone.getDefault()), l04.g(j4, TimeZone.getDefault())) ? p(context2, j4, locale2) : z2 ? j6 < 14400000 ? p(context2, j4, locale2) : context2.getString(avb.tt_dates_yesterday) : String.format(context2.getString(avb.tt_dates_yesterday_at), new Object[]{p(context2, j4, locale2)});
        }
        l04 g3 = l04.g(j5, TimeZone.getDefault());
        g2.f();
        Integer num = g2.c;
        g2.f();
        l04 l2 = new l04(g2.a, g2.b, num, (Integer) null, (Integer) null, (Integer) null, 0).l(1);
        g3.f();
        Integer num2 = g3.c;
        g3.f();
        l04 l04 = r9;
        l04 l042 = new l04(g3.a, g3.b, num2, (Integer) null, (Integer) null, (Integer) null, 0);
        return l2.equals(l04) ? z2 ? context2.getString(avb.tt_dates_yesterday) : String.format(context2.getString(avb.tt_dates_yesterday_at), new Object[]{p(context2, j4, locale2)}) : g2.a.equals(g3.a) ? x(locale2, j4, false) : x(locale2, j4, true);
    }

    public static String p(Context context, long j2, Locale locale) {
        String format;
        synchronized (c) {
            format = u(context, locale).format(Long.valueOf(j2));
        }
        return format;
    }

    public static String q(long j2) {
        int i2 = ((int) j2) / 60;
        long j3 = j2 - ((long) (i2 * 60));
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(":");
        sb.append(j3 < 10 ? "0" : BuildConfig.FLAVOR);
        sb.append(j3);
        return sb.toString();
    }

    public static String r(int i2, int i3, Context context) {
        String[] strArr = dhe.b;
        return String.format(context.getResources().getQuantityString(i2, i3), new Object[]{Integer.valueOf(i3)});
    }

    public static c9e s(String str) {
        LinkedHashMap linkedHashMap;
        Set set;
        String str2;
        String str3;
        String str4;
        Object obj;
        String string;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray names = jSONObject2.names();
        int length = names != null ? names.length() : 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!(names == null || (string = names.getString(i2)) == null)) {
                linkedHashMap2.put(string, jSONObject2.getString(string));
            }
        }
        String str5 = "versionName";
        String string2 = jSONObject.getString(str5);
        long j2 = jSONObject.getLong("versionCode");
        String str6 = "packageName";
        String optString = jSONObject.optString(str6);
        if (optString.length() <= 0) {
            optString = null;
        }
        if (optString == null) {
            try {
                Context context = nne.d;
                if (context == null) {
                    context = null;
                }
                obj = context.getPackageName();
            } catch (Throwable th) {
                obj = new kcc(th);
            }
            if (mcc.a(obj) != null) {
                obj = "NA";
            }
            optString = (String) obj;
        }
        String str7 = "environment";
        String optString2 = jSONObject.optString(str7);
        if (optString2.length() <= 0) {
            optString2 = null;
        }
        String optString3 = jSONObject.optString("buildUuid");
        if (optString3.length() <= 0) {
            optString3 = null;
        }
        String optString4 = jSONObject.optString("sessionUuid");
        if (optString4.length() <= 0) {
            optString4 = null;
        }
        if (optString4 == null) {
            optString4 = UUID.randomUUID().toString();
        }
        String string3 = jSONObject.getString("device");
        String string4 = jSONObject.getString("deviceId");
        String string5 = jSONObject.getString("vendor");
        String string6 = jSONObject.getString("osVersion");
        boolean z2 = jSONObject.getBoolean("inBackground");
        boolean z3 = jSONObject.getBoolean("isRooted");
        JSONArray optJSONArray = jSONObject.optJSONArray("hostedLibrariesInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            linkedHashMap = linkedHashMap2;
            set = qw4.a;
        } else {
            u3d u3d = new u3d();
            int length2 = optJSONArray.length();
            linkedHashMap = linkedHashMap2;
            int i3 = 0;
            while (i3 < length2) {
                int i4 = length2;
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i3);
                JSONArray jSONArray = optJSONArray;
                String string7 = jSONObject3.getString(str6);
                String str8 = str6;
                String string8 = jSONObject3.getString(str5);
                String optString5 = jSONObject3.optString("buildUuid");
                if (optString5.length() > 0) {
                    String str9 = optString5;
                    str2 = str5;
                    str3 = str9;
                } else {
                    str2 = str5;
                    str3 = null;
                }
                String optString6 = jSONObject3.optString(str7);
                if (optString6.length() > 0) {
                    str4 = str7;
                } else {
                    str4 = str7;
                    optString6 = null;
                }
                u3d.add(new lk6(string7, string8, str3, optString6));
                i3++;
                length2 = i4;
                optJSONArray = jSONArray;
                str6 = str8;
                str5 = str2;
                str7 = str4;
            }
            set = z3d.h(u3d);
        }
        return new c9e(string2, j2, optString, optString2, optString3, optString4, string3, string4, string5, string6, z2, z3, linkedHashMap, set);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089 A[SYNTHETIC, Splitter:B:20:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap t(android.net.Uri r15) {
        /*
            java.lang.String r0 = "r"
            vl r1 = vl.o
            android.content.ContentResolver r1 = r1.getContentResolver()
            r2 = 1
            r3 = 0
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x0081, all -> 0x007f }
            java.io.FileDescriptor r5 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            int r6 = defpackage.at7.z0     // Catch:{ IOException -> 0x007d }
            v25 r6 = new v25     // Catch:{ IOException -> 0x007d }
            r6.<init>((java.io.FileDescriptor) r5)     // Catch:{ IOException -> 0x007d }
            java.lang.String r5 = "Orientation"
            int r5 = r6.e(r2, r5)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r6 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            android.graphics.Point r6 = defpackage.at7.q(r6, r5)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x007d }
            r7.<init>()     // Catch:{ IOException -> 0x007d }
            r8 = 2048(0x800, float:2.87E-42)
            int r6 = defpackage.at7.v(r6, r8, r8)     // Catch:{ IOException -> 0x007d }
            r7.inSampleSize = r6     // Catch:{ IOException -> 0x007d }
            android.os.ParcelFileDescriptor r4 = r1.openFileDescriptor(r15, r0)     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r3, r7)     // Catch:{ IOException -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007d }
            int r1 = defpackage.at7.w(r5)     // Catch:{ IOException -> 0x007d }
            if (r1 != 0) goto L_0x0059
            defpackage.ete.n(r4)
            r3 = r0
            goto L_0x00c1
        L_0x0059:
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch:{ IOException -> 0x007d }
            r13.<init>()     // Catch:{ IOException -> 0x007d }
            float r1 = (float) r1     // Catch:{ IOException -> 0x007d }
            r13.setRotate(r1)     // Catch:{ IOException -> 0x007d }
            int r11 = r0.getWidth()     // Catch:{ IOException -> 0x007d }
            int r12 = r0.getHeight()     // Catch:{ IOException -> 0x007d }
            r10 = 0
            r14 = 1
            r9 = 0
            r8 = r0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x007d }
            r0.recycle()     // Catch:{ IOException -> 0x007d }
            defpackage.ete.n(r4)
            r3 = r1
            goto L_0x00c1
        L_0x007a:
            r15 = move-exception
            r3 = r4
            goto L_0x00c2
        L_0x007d:
            r0 = move-exception
            goto L_0x0083
        L_0x007f:
            r15 = move-exception
            goto L_0x00c2
        L_0x0081:
            r0 = move-exception
            r4 = r3
        L_0x0083:
            boolean r1 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x007a }
            java.lang.String r5 = "xs7"
            if (r1 == 0) goto L_0x00bb
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x007a }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00a6 }
            r0.<init>(r15)     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "file by path %s not exists"
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x00a6 }
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r2)     // Catch:{ all -> 0x00a6 }
            defpackage.udd.R(r5, r3, r0, r15)     // Catch:{ all -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r15 = move-exception
            goto L_0x00b2
        L_0x00a8:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00a6 }
            r0.<init>()     // Catch:{ all -> 0x00a6 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r15, r0)     // Catch:{ all -> 0x00a6 }
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = "getBitmapFromExternalStorage fail"
            defpackage.udd.S(r5, r0, r15)     // Catch:{ all -> 0x007a }
        L_0x00b7:
            defpackage.ete.n(r4)
            goto L_0x00c1
        L_0x00bb:
            java.lang.String r15 = "getBitmapFromPath: failed to get bitmap"
            defpackage.udd.s(r5, r15, r0)     // Catch:{ all -> 0x007a }
            goto L_0x00b7
        L_0x00c1:
            return r3
        L_0x00c2:
            defpackage.ete.n(r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs7.t(android.net.Uri):android.graphics.Bitmap");
    }

    public static DateFormat u(Context context, Locale locale) {
        boolean booleanValue;
        if (b == null) {
            synchronized (t) {
                try {
                    if (s == null) {
                        s = Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context));
                    }
                    booleanValue = s.booleanValue();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            b = new SimpleDateFormat(booleanValue ? "HH:mm" : "h:mm a", locale);
        }
        return b;
    }

    public static sz0 v(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (j4 <= 0) {
            return new sz0(0, 10, 1, false);
        }
        long j6 = j5 - j4;
        if (j6 < 0) {
            return new sz0(0, 10, 1, false);
        }
        if (C(l04.g(j5, TimeZone.getDefault()), l04.g(j4, TimeZone.getDefault()))) {
            if (j6 < 60000) {
                return new sz0(0, 1, 1, false);
            }
            if (j6 < 3600000) {
                return new sz0((long) ((int) (j6 / 60000)), 2, 1, false);
            }
            if (j6 < 86400000) {
                return new sz0((long) ((int) (j6 / 3600000)), 3, 1, false);
            }
        }
        if (j6 < 3600000) {
            return new sz0((long) ((int) (j6 / 60000)), 2, 1, false);
        }
        if (j6 < 86400000) {
            return new sz0(j2, 4, 1, false);
        }
        if (j6 < 129600000) {
            return new sz0(0, 4, 1, false);
        }
        return l04.g(j4, TimeZone.getDefault()).a.equals(l04.g(j5, TimeZone.getDefault()).a) ? new sz0(j2, 9, 1, false) : new sz0(j2, 8, 1, false);
    }

    public static String w(Locale locale, long j2, boolean z2) {
        String str;
        if (z2) {
            synchronized (k) {
                if (j == null) {
                    j = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str = j.format(Long.valueOf(j2));
            }
        } else {
            synchronized (i) {
                if (h == null) {
                    h = new SimpleDateFormat("d MMM", locale);
                }
                str = h.format(Long.valueOf(j2));
            }
        }
        return str;
    }

    public static String x(Locale locale, long j2, boolean z2) {
        String format;
        String format2;
        if (z2) {
            synchronized (g) {
                if (f == null) {
                    f = new SimpleDateFormat("d MMM yyyy", locale);
                }
                format2 = f.format(Long.valueOf(j2));
            }
            return format2;
        }
        synchronized (e) {
            if (d == null) {
                d = new SimpleDateFormat("d MMM", locale);
            }
            format = d.format(Long.valueOf(j2));
        }
        return format;
    }

    public static String y(Context context, Locale locale, long j2, boolean z2) {
        String str;
        String string = context.getString(avb.tt_at);
        if (z2) {
            synchronized (m) {
                if (l == null) {
                    l = new SimpleDateFormat("dd.MM.yy", locale);
                }
                str = l.format(Long.valueOf(j2));
            }
        } else {
            str = w(locale, j2, false);
        }
        return String.format(string, new Object[]{str, p(context, j2, locale)});
    }

    public static Handler z() {
        if (a != null) {
            return a;
        }
        synchronized (xs7.class) {
            try {
                if (a == null) {
                    a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return a;
    }

    public y29 j(e39 e39) {
        ByteBuffer byteBuffer = e39.o;
        byteBuffer.getClass();
        swb.e(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (e39.f(Integer.MIN_VALUE)) {
            return null;
        }
        return k(e39, byteBuffer);
    }

    public abstract y29 k(e39 e39, ByteBuffer byteBuffer);
}
