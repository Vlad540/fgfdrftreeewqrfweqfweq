package one.me.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u0002"}, d2 = {"Lone/me/android/OneMeApplication;", "Landroid/app/Application;", "Lqa3;", "Ljae;", "", "Lne6;", "Loe6;", "<init>", "()V", "Lnne;", "tracer", "Lsne;", "report", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class OneMeApplication extends Application implements qa3, jae, ne6, oe6 {
    public static final /* synthetic */ int w0 = 0;
    public final long X = SystemClock.elapsedRealtime();
    public final String Y;
    public final r7e Z;
    public final t97 a = ez3.O(3, new m29(16));
    public final zo b = zo.a;
    public final ArrayList c = new ArrayList();
    public final r7e o = new r7e(new m29(17));

    public OneMeApplication() {
        String name = OneMeApplication.class.getName();
        this.Y = name;
        Looper.getMainLooper();
        new es7();
        oma oma = oma.b;
        zo.b.k(oma, new nma(oma, SystemClock.elapsedRealtime()));
        udd.e = new n5a();
        int i = tzd.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, "AppVersion 25.7.2(6386)--1", (Throwable) null);
        }
        this.Z = new r7e(new ly9(this, 4));
    }

    public final sa3 a() {
        return (sa3) o2a.a.getAccessor().c(sa3.class);
    }

    public final void attachBaseContext(Context context) {
        int i = fja.d;
        if (!r1g.p("ru")) {
            Locale locale = new Locale("ru");
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.fontScale = 0.0f;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
        if (!ProcessPhoenix.a(this)) {
            wy9 wy9 = new wy9(context, this);
            hhd.a = hhd.G(wy9);
            su5 c2 = c();
            zu4 zu4 = new zu4(wy9, 20, this);
            hw4 hw4 = hw4.a;
            pu5 a2 = c2.a("Tracer", hw4, zu4);
            ArrayList arrayList = this.c;
            arrayList.add(a2);
            pu5 a3 = c().a("Scout", Collections.singletonList(a2), new eg4(this, wy9));
            arrayList.add(a3);
            arrayList.add(c().a("Protobuf", Collections.singletonList(a2), new m29(9)));
            b(c(), "LibraryUpgrade", hw4, new ly9(this, 0));
            c().a("Account", Collections.singletonList(a3), new m29(12));
            b(c(), "AnrWatcher", hw4, new ly9(this, 1));
            su5.b(c(), "SetupRx", new m29(13));
            su5.b(c(), "RxJavaPlugins.setErrorHandler", new ly9(this, 2));
            pu5 a4 = c().a("Chroma.init", hw4, new ly9(this, 3));
            b(c(), "AppTracerCrashService", hw4, new m29(14));
            b(c(), "IoPoolSize", Collections.singletonList(b(c(), "Logger", hw4, new m29(15))), new m29(18));
            b(c(), "Fresco", hw4, new m29(26));
            b(c(), "Theme background warmup", hw4, new ly9(this, 14));
            b(c(), "Chroma.dynamicChange", Collections.singletonList(a4), new ly9(this, 15));
            b(c(), "DynamicFont", hw4, new ly9(this, 18));
            b(c(), "NativeMedia", hw4, new my9(16));
            b(c(), "EmojiProvider", hw4, new my9(17));
            b(c(), "Animoji warmup", hw4, new my9(18));
            b(c(), "VisibilityController", hw4, new m29(7));
            b(c(), "ProxyChangeListener", hw4, new m29(8));
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            pu5 b2 = b(c(), "InitialDataStorage.Banners", hw4, new qk8(10, atomicBoolean));
            AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
            b(c(), "LegacyChats", p23.B(b(c(), "InitialDataStorage.Chats&Folders", Collections.singletonList(b2), new ft3(atomicReference, 1)), b2), new k61(this, atomicBoolean, atomicReference, 3));
            b(c(), "RemoveAccountIfNeed", hw4, new m29(10));
            b(c(), "Folders Warmup", hw4, new m29(11));
        }
    }

    public final pu5 b(su5 su5, String str, Iterable iterable, s16 s16) {
        ArrayList arrayList = this.c;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (hhd.f(((pu5) it.next()).a, str)) {
                    throw new IllegalStateException(("Task " + str + " is root").toString());
                }
            }
        }
        return su5.a(str, o23.i0(arrayList, iterable), s16);
    }

    public final su5 c() {
        return (su5) this.a.getValue();
    }

    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        qcd qcd = (qcd) this.Z.getValue();
        return (SharedPreferences) ((ConcurrentHashMap) qcd.b.getValue()).computeIfAbsent(str, new di(17, new lxc(qcd, str, 2)));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ka3 ka3 = (ka3) this.o.getValue();
        ka3.getClass();
        boolean z = (configuration.uiMode & 48) == 32;
        Boolean bool = ka3.b;
        j54 j54 = ka3.a;
        if (bool == null) {
            ka3.b = Boolean.valueOf(z);
            ka3.c = Float.valueOf(configuration.fontScale);
            ((xce) ((t97) j54.X).getValue()).b(true);
            return;
        }
        if (bool.booleanValue() != z) {
            udd.p("ka3", "onConfigurationChanged: system night mode changed to " + z, new Object[0]);
            ka3.b = Boolean.valueOf(z);
            ((xce) ((t97) j54.X).getValue()).b(true);
        }
        if (ka3.c.floatValue() != configuration.fontScale) {
            udd.p("ka3", "onConfigurationChanged: fontScale changed from " + ka3.c + " to " + configuration.fontScale, new Object[0]);
            ka3.c = Float.valueOf(configuration.fontScale);
            Context context = (Context) ((w4) j54.a).c(Context.class);
            zg4.b().c();
            ((n1b) ((t97) j54.b).getValue()).a();
            ((di3) ((t97) j54.c).getValue()).e();
            ((t52) ((t97) j54.o).getValue()).s();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x01ef, code lost:
        if (r12 < r5[2]) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x01f3, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x01ff, code lost:
        if (r12 < r5[1]) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0207, code lost:
        if (r12 < r5[0]) goto L_0x01f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r18 = this;
            r0 = r18
            r1 = 11
            r2 = 10
            r3 = 9
            r4 = 6
            r5 = 13
            r6 = 0
            r7 = 12
            r8 = 3
            r9 = 1
            r10 = 5
            r11 = 2
            java.lang.String r12 = r0.Y
            java.lang.String r13 = "onCreate"
            defpackage.udd.p(r12, r13, new java.lang.Object[0])
            super.onCreate()
            boolean r12 = com.jakewharton.processphoenix.ProcessPhoenix.a(r18)
            if (r12 == 0) goto L_0x0023
            return
        L_0x0023:
            su5 r12 = r18.c()
            ly9 r13 = new ly9
            r13.<init>(r0, r10)
            hw4 r14 = defpackage.hw4.a
            java.lang.String r15 = "DevicePerformanceClass"
            r0.b(r12, r15, r14, r13)
            su5 r12 = r18.c()
            m29 r13 = new m29
            r15 = 27
            r13.<init>(r15)
            java.lang.String r15 = "ServerPayloadCatchMode"
            pu5 r12 = r0.b(r12, r15, r14, r13)
            su5 r13 = r18.c()
            my9 r15 = new my9
            r15.<init>(r6)
            java.lang.String r6 = "Connect"
            r0.b(r13, r6, r14, r15)
            su5 r6 = r18.c()
            java.util.List r12 = java.util.Collections.singletonList(r12)
            ly9 r13 = new ly9
            r13.<init>(r0, r5)
            java.lang.String r15 = "LocaleHelper"
            pu5 r6 = r0.b(r6, r15, r12, r13)
            java.util.List r6 = java.util.Collections.singletonList(r6)
            su5 r12 = r18.c()
            my9 r13 = new my9
            r13.<init>(r9)
            java.lang.String r15 = "Legacy.Stickers"
            r0.b(r12, r15, r6, r13)
            su5 r12 = r18.c()
            my9 r13 = new my9
            r13.<init>(r11)
            java.lang.String r15 = "ForceUpdateLogic.clearForceUpdateVersionIfNeed"
            r0.b(r12, r15, r6, r13)
            su5 r12 = r18.c()
            my9 r13 = new my9
            r13.<init>(r8)
            java.lang.String r15 = "ServiceTaskCheckProcessingTasks"
            r0.b(r12, r15, r6, r13)
            su5 r12 = r18.c()
            my9 r13 = new my9
            r15 = 4
            r13.<init>(r15)
            java.lang.String r15 = "Legacy.ContactsLoader"
            r0.b(r12, r15, r6, r13)
            su5 r12 = r18.c()
            my9 r13 = new my9
            r13.<init>(r10)
            java.lang.String r15 = "Legacy.CallsHistoryLoader"
            r0.b(r12, r15, r6, r13)
            su5 r12 = r18.c()
            my9 r13 = new my9
            r13.<init>(r4)
            java.lang.String r15 = "Legacy.MessageControllerConsumer"
            r0.b(r12, r15, r6, r13)
            su5 r12 = r18.c()
            ly9 r13 = new ly9
            r13.<init>(r0, r4)
            java.lang.String r4 = "Legacy.ActivityLifecycleCallbacks"
            r0.b(r12, r4, r6, r13)
            su5 r4 = r18.c()
            m29 r12 = new m29
            r13 = 19
            r12.<init>(r13)
            java.lang.String r13 = "RestoreMessageUploads"
            r0.b(r4, r13, r6, r12)
            su5 r4 = r18.c()
            m29 r12 = new m29
            r13 = 20
            r12.<init>(r13)
            java.lang.String r13 = "Legacy.Drafts"
            r0.b(r4, r13, r6, r12)
            su5 r4 = r18.c()
            m29 r12 = new m29
            r13 = 21
            r12.<init>(r13)
            java.lang.String r13 = "Legacy.Phonebook"
            r0.b(r4, r13, r6, r12)
            su5 r4 = r18.c()
            m29 r12 = new m29
            r13 = 22
            r12.<init>(r13)
            java.lang.String r13 = "Legacy.SystemServicesManager"
            r0.b(r4, r13, r14, r12)
            su5 r4 = r18.c()
            m29 r12 = new m29
            r13 = 23
            r12.<init>(r13)
            java.lang.String r13 = "Legacy.ShortcutsHelper"
            r0.b(r4, r13, r6, r12)
            su5 r4 = r18.c()
            ly9 r12 = new ly9
            r13 = 7
            r12.<init>(r0, r13)
            java.lang.String r13 = "Legacy.Permissions"
            r0.b(r4, r13, r14, r12)
            su5 r4 = r18.c()
            ly9 r12 = new ly9
            r13 = 8
            r12.<init>(r0, r13)
            java.lang.String r13 = "PermissionStats"
            r0.b(r4, r13, r14, r12)
            su5 r4 = r18.c()
            m29 r12 = new m29
            r13 = 24
            r12.<init>(r13)
            java.lang.String r13 = "Legacy.PhoneNumberUtil"
            r0.b(r4, r13, r6, r12)
            su5 r4 = r18.c()
            m29 r12 = new m29
            r13 = 25
            r12.<init>(r13)
            java.lang.String r13 = "Legacy.CallLinksLoader"
            r0.b(r4, r13, r6, r12)
            su5 r4 = r18.c()
            ly9 r12 = new ly9
            r12.<init>(r0, r3)
            java.lang.String r13 = "Legacy.StartupListeners"
            r0.b(r4, r13, r6, r12)
            su5 r4 = r18.c()
            m29 r6 = new m29
            r12 = 28
            r6.<init>(r12)
            java.lang.String r12 = "Shortcuts and badge warmup"
            r0.b(r4, r12, r14, r6)
            su5 r4 = r18.c()
            ly9 r6 = new ly9
            r6.<init>(r0, r2)
            java.lang.String r12 = "InAppReviewUncaughtExceptionHandler"
            r0.b(r4, r12, r14, r6)
            su5 r4 = r18.c()
            m29 r6 = new m29
            r12 = 29
            r6.<init>(r12)
            java.lang.String r12 = "HeartbeatScheduler"
            r0.b(r4, r12, r14, r6)
            su5 r4 = r18.c()
            ly9 r6 = new ly9
            r6.<init>(r0, r1)
            java.lang.String r12 = "Db.NotMainThreadListener"
            r0.b(r4, r12, r14, r6)
            su5 r4 = r18.c()
            ly9 r6 = new ly9
            r6.<init>(r0, r7)
            java.lang.String r12 = "Mytracker"
            r0.b(r4, r12, r14, r6)
            su5 r4 = r18.c()
            r4.getClass()
            java.util.ArrayList r6 = r4.c     // Catch:{ all -> 0x040c }
            java.util.concurrent.ForkJoinTask.invokeAll(r6)     // Catch:{ all -> 0x040c }
            java.util.ArrayList r4 = r4.c
            r4.clear()
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.X
            long r12 = r12 - r5
            sma r4 = defpackage.js.u(r18)
            o2a r5 = defpackage.o2a.a
            j2b r5 = r5.n()
            yzc r5 = r5.b
            r5.getClass()
            long[] r5 = xzc.c
            int r6 = r5.length
            if (r6 != r8) goto L_0x0400
            vf4 r4 = r4.a
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0202
            if (r4 == r9) goto L_0x01fb
            if (r4 != r11) goto L_0x01f5
            r4 = r5[r11]
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f3
        L_0x01f1:
            r4 = r9
            goto L_0x020a
        L_0x01f3:
            r4 = 0
            goto L_0x020a
        L_0x01f5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01fb:
            r4 = r5[r9]
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f3
            goto L_0x01f1
        L_0x0202:
            r4 = 0
            r5 = r5[r4]
            int r4 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f3
            goto L_0x01f1
        L_0x020a:
            r4 = r4 ^ r9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            java.lang.String r15 = "ms from start!\n"
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r6 = "Total tasks durations: "
            r5.append(r6)
            su5 r6 = r18.c()
            ru5 r6 = r6.b
            java.lang.Object r6 = r6.b
            java.util.concurrent.ConcurrentSkipListSet r6 = (java.util.concurrent.ConcurrentSkipListSet) r6
            java.util.Iterator r6 = r6.iterator()
            r16 = 0
            r1 = r16
        L_0x023b:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x0258
            java.lang.Object r16 = r6.next()
            r15 = r16
            gy7 r15 = (gy7) r15
            java.util.concurrent.TimeUnit r3 = r15.o
            long r7 = r15.c
            long r7 = r3.toMillis(r7)
            long r1 = r1 + r7
            r3 = 9
            r7 = 12
            r8 = 3
            goto L_0x023b
        L_0x0258:
            r5.append(r1)
            java.lang.String r1 = "ms \nTopmost by durations:\n"
            r5.append(r1)
            su5 r1 = r18.c()
            ru5 r1 = r1.b
            java.util.Comparator r2 = java.util.Comparator.reverseOrder()
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>(r2)
            defpackage.o23.p0(r1, r3)
            qq9 r1 = new qq9
            r1.<init>(r11)
            r2 = 44
            defpackage.o23.b0(r3, r5, r10, r1, r2)
            java.lang.String r1 = "\nTopmost by waiting:\n"
            r5.append(r1)
            su5 r1 = r18.c()
            ru5 r1 = r1.b
            xy9 r3 = defpackage.xy9.a
            hv6 r3 = new hv6
            r3.<init>(r9)
            java.util.Comparator r3 = java.util.Comparator.comparingLong(r3)
            java.util.Comparator r3 = r3.reversed()
            java.util.TreeSet r6 = new java.util.TreeSet
            r6.<init>(r3)
            defpackage.o23.p0(r1, r6)
            qq9 r1 = new qq9
            r3 = 3
            r1.<init>(r3)
            defpackage.o23.b0(r6, r5, r10, r1, r2)
            java.lang.String r1 = "\nThreads info:\n"
            r5.append(r1)
            su5 r1 = r18.c()
            ru5 r1 = r1.b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.Object r1 = r1.b
            java.util.concurrent.ConcurrentSkipListSet r1 = (java.util.concurrent.ConcurrentSkipListSet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x02bf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02e2
            java.lang.Object r3 = r1.next()
            r6 = r3
            gy7 r6 = (gy7) r6
            java.lang.String r6 = r6.X
            java.lang.Object r7 = r2.get(r6)
            if (r7 != 0) goto L_0x02dc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2.put(r6, r7)
        L_0x02dc:
            java.util.List r7 = (java.util.List) r7
            r7.add(r3)
            goto L_0x02bf
        L_0x02e2:
            bk r1 = new bk
            r3 = 12
            r1.<init>(r3, r5)
            h03 r3 = new h03
            r3.<init>(r11, r1)
            r2.forEach(r3)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = r0.Y
            defpackage.udd.p(r2, r1, new java.lang.Object[0])
            y0f r2 = y0f.a
            pv3 r3 = r2.c()
            mk9 r5 = tn7.c
            op r3 = (defpackage.op) r3
            r3.getClass()
            r7e r3 = defpackage.op.e
            java.lang.Object r3 = r3.getValue()
            sne r3 = (sne) r3
            if (r3 == 0) goto L_0x0314
            sne.a(r1)
        L_0x0314:
            if (r4 == 0) goto L_0x0358
            pv3 r1 = r2.c()
            sma r2 = defpackage.js.u(r18)
            o2a r3 = defpackage.o2a.a
            w4 r3 = r3.getAccessor()
            java.lang.Class<zy9> r4 = zy9.class
            java.lang.Object r3 = r3.c(r4)
            zy9 r3 = (zy9) r3
            boolean r3 = r3.d()
            one.me.android.perfomance.ApplicationCreationOvertimeException r4 = new one.me.android.perfomance.ApplicationCreationOvertimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "isLoggedIn="
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " creationTime="
            r5.append(r3)
            r5.append(r12)
            java.lang.String r3 = " perfClass="
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            java.lang.String r2 = "ONEME-1862"
            r1.a(r2, r4)
        L_0x0358:
            r1 = 0
            wia[] r2 = new defpackage.wia[r1]
            java.lang.String r1 = "app_creation_duration"
            hoe r3 = hoe.a     // Catch:{ all -> 0x0371 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0371 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0371 }
            long r4 = r4.toNanos(r12)     // Catch:{ all -> 0x0371 }
            r6 = 0
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch:{ all -> 0x0371 }
            wia[] r2 = (defpackage.wia[]) r2     // Catch:{ all -> 0x0371 }
            hoe.a(r1, r4, r3, r2)     // Catch:{ all -> 0x0371 }
        L_0x0371:
            su5 r1 = r18.c()
            my9 r2 = new my9
            r3 = 9
            r2.<init>(r3)
            java.lang.String r3 = "GalleryPrefetch"
            su5.b(r1, r3, r2)
            ly9 r2 = new ly9
            r3 = 16
            r2.<init>(r0, r3)
            java.lang.String r3 = "Legacy.TimeChangeReceiver"
            r1.a(r3, r14, r2)
            my9 r2 = new my9
            r3 = 10
            r2.<init>(r3)
            java.lang.String r3 = "Legacy.Theme.ScheduleNightModeCheckIfNeed"
            r1.a(r3, r14, r2)
            ly9 r2 = new ly9
            r3 = 17
            r2.<init>(r0, r3)
            java.lang.String r3 = "Legacy.SendInstallInfo"
            r1.a(r3, r14, r2)
            my9 r2 = new my9
            r3 = 11
            r2.<init>(r3)
            java.lang.String r3 = "Legacy.DailyAnalytics"
            r1.a(r3, r14, r2)
            my9 r2 = new my9
            r3 = 12
            r2.<init>(r3)
            java.lang.String r3 = "NotificationTrackerCleanupScheduler"
            r1.a(r3, r14, r2)
            my9 r2 = new my9
            r3 = 13
            r2.<init>(r3)
            java.lang.String r3 = "Stickers warmup"
            r1.a(r3, r14, r2)
            my9 r2 = new my9
            r3 = 14
            r2.<init>(r3)
            java.lang.String r3 = "QrCodeGenerator"
            r1.a(r3, r14, r2)
            zo r0 = r0.b
            r0.getClass()
            oma r0 = oma.b
            jc9 r1 = zo.b
            java.lang.Object r2 = r1.f(r0)
            nma r2 = (nma) r2
            if (r2 == 0) goto L_0x03ff
            long r2 = r2.e
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x03ff
            java.lang.Object r0 = r1.f(r0)
            nma r0 = (nma) r0
            if (r0 == 0) goto L_0x03ff
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.b
            long r1 = r1 - r3
            r0.e = r1
        L_0x03ff:
            return
        L_0x0400:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x040c:
            r0 = move-exception
            java.util.ArrayList r1 = r4.c     // Catch:{ all -> 0x0429 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0429 }
            r2 = r0
        L_0x0414:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0429 }
            if (r3 == 0) goto L_0x043e
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0429 }
            qu5 r3 = (qu5) r3     // Catch:{ all -> 0x0429 }
            java.lang.Throwable r5 = r3.o     // Catch:{ all -> 0x0429 }
            if (r5 == 0) goto L_0x042b
            java.lang.Class r6 = r5.getClass()     // Catch:{ all -> 0x0429 }
            goto L_0x042c
        L_0x0429:
            r0 = move-exception
            goto L_0x043f
        L_0x042b:
            r6 = 0
        L_0x042c:
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x0429 }
            boolean r6 = defpackage.hhd.f(r6, r7)     // Catch:{ all -> 0x0429 }
            if (r6 == 0) goto L_0x0437
            r2 = r5
        L_0x0437:
            r3.cancel(r9)     // Catch:{ all -> 0x0429 }
            r3.completeExceptionally(r0)     // Catch:{ all -> 0x0429 }
            goto L_0x0414
        L_0x043e:
            throw r2     // Catch:{ all -> 0x0429 }
        L_0x043f:
            java.util.ArrayList r1 = r4.c
            r1.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.OneMeApplication.onCreate():void");
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 40 && !ProcessPhoenix.a(this)) {
            udd.p(this.Y, "onTrimMemory: TRIM_MEMORY_BACKGROUND", new Object[0]);
            fq6 fq6 = (fq6) o2a.a.getAccessor().c(fq6.class);
            ((x4a) fq6.d.getValue()).a().execute(new eq6(0, fq6));
            LruCache lruCache = nhe.a;
            udd.p("ThemeBackgroundCache", "clear cache of themes.", new Object[0]);
            nhe.a.evictAll();
        }
    }
}
