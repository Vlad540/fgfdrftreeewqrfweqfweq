package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: ue3  reason: default package */
public final class ue3 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ ue3(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v33, types: [j8e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v37, types: [ygd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0270, code lost:
        r1 = (com.google.android.material.appbar.AppBarLayout$BaseBehavior) r8.o;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0258 A[SYNTHETIC, Splitter:B:82:0x0258] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0261 A[SYNTHETIC, Splitter:B:87:0x0261] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0266  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r0 = 5
            r1 = 1
            r2 = 0
            r3 = 0
            int r4 = r8.a
            switch(r4) {
                case 0: goto L_0x02bd;
                case 1: goto L_0x02a6;
                case 2: goto L_0x026a;
                case 3: goto L_0x0211;
                case 4: goto L_0x01da;
                case 5: goto L_0x01c0;
                case 6: goto L_0x01a3;
                case 7: goto L_0x0191;
                case 8: goto L_0x015c;
                case 9: goto L_0x008f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r8.b
            h13 r4 = (defpackage.h13) r4
            java.lang.String r5 = "google.message_id"
            android.content.Intent r6 = r4.a
            java.lang.String r5 = r6.getStringExtra(r5)
            if (r5 != 0) goto L_0x001d
            java.lang.String r5 = "message_id"
            java.lang.String r5 = r6.getStringExtra(r5)
        L_0x001d:
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0028
            n6g r1 = defpackage.gwf.o(r2)
            goto L_0x007d
        L_0x0028:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "google.message_id"
            android.content.Intent r7 = r4.a
            java.lang.String r6 = r7.getStringExtra(r6)
            if (r6 != 0) goto L_0x003d
            java.lang.String r6 = "message_id"
            java.lang.String r6 = r7.getStringExtra(r6)
        L_0x003d:
            java.lang.String r7 = "google.message_id"
            r5.putString(r7, r6)
            android.content.Intent r4 = r4.a
            java.lang.String r6 = "google.product_id"
            boolean r7 = r4.hasExtra(r6)
            if (r7 == 0) goto L_0x0054
            int r2 = r4.getIntExtra(r6, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0054:
            if (r2 == 0) goto L_0x005f
            java.lang.String r4 = "google.product_id"
            int r2 = r2.intValue()
            r5.putInt(r4, r2)
        L_0x005f:
            java.lang.String r2 = "supports_message_handled"
            r5.putBoolean(r2, r1)
            java.lang.Object r2 = r8.c
            android.content.Context r2 = (android.content.Context) r2
            i6g r4 = defpackage.i6g.g(r2)
            v5g r2 = new v5g
            monitor-enter(r4)
            int r6 = r4.b     // Catch:{ all -> 0x008c }
            int r1 = r1 + r6
            r4.b = r1     // Catch:{ all -> 0x008c }
            monitor-exit(r4)
            r1 = 2
            r2.<init>(r6, r1, r5, r3)
            n6g r1 = r4.h(r2)
        L_0x007d:
            mh4 r2 = defpackage.mh4.c
            bae r3 = new bae
            java.lang.Object r8 = r8.o
            java.util.concurrent.CountDownLatch r8 = (java.util.concurrent.CountDownLatch) r8
            r3.<init>(r0, r8)
            r1.b(r2, r3)
            return
        L_0x008c:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008c }
            throw r8
        L_0x008f:
            j8e r0 = new j8e
            java.lang.Object r4 = r8.c
            android.content.Context r4 = (android.content.Context) r4
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>(r2)
            r0.c = r5
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r0.o = r2
            r0.b = r4
            java.lang.Object r2 = r8.b
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
            nvf r4 = new nvf
            r4.<init>(r8)
            java.lang.String r8 = "\\"
            java.lang.String r5 = "\\\\"
            java.lang.String r8 = r2.replace(r8, r5)
            java.lang.String r2 = "'"
            java.lang.String r5 = "\\'"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "</"
            java.lang.String r5 = "<\\/"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "\n"
            java.lang.String r5 = "\\n"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "\r"
            java.lang.String r5 = "\\r"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "evgeniiJsEvaluator.returnResultToJava(eval('try{"
            java.lang.String r5 = "}catch(e){\"evgeniiJsEvaluatorException\"+e}'));"
            java.lang.String r8 = wn6.i(r2, r8, r5)
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            r2.set(r4)
            java.lang.Object r2 = r0.a
            ygd r2 = (defpackage.ygd) r2
            if (r2 != 0) goto L_0x011d
            ygd r2 = new ygd
            r2.<init>()
            android.webkit.WebView r4 = new android.webkit.WebView
            java.lang.Object r5 = r0.b
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5)
            r2.a = r4
            r4.setWillNotDraw(r1)
            android.webkit.WebSettings r5 = r4.getSettings()
            r5.setJavaScriptEnabled(r1)
            java.lang.String r1 = "utf-8"
            r5.setDefaultTextEncodingName(r1)
            ru.ok.messages.video.fetcher.youtube.js.JavaScriptInterface r1 = new ru.ok.messages.video.fetcher.youtube.js.JavaScriptInterface
            r1.<init>(r0)
            java.lang.String r5 = "evgeniiJsEvaluator"
            r4.addJavascriptInterface(r1, r5)
            r0.a = r2
        L_0x011d:
            java.lang.Object r0 = r0.a
            ygd r0 = (defpackage.ygd) r0
            r0.getClass()
            java.lang.String r1 = "data:text/html;charset=utf-8;base64,"
            java.lang.String r2 = "<script>"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            r4.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            r4.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            java.lang.String r8 = "</script>"
            r4.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            java.lang.String r8 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            java.lang.String r2 = "UTF-8"
            byte[] r8 = r8.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r3)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            java.lang.Object r0 = r0.a     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            android.webkit.WebView r0 = (android.webkit.WebView) r0     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            r2.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            r2.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            java.lang.String r8 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            r0.loadUrl(r8)     // Catch:{ UnsupportedEncodingException -> 0x0157 }
            goto L_0x015b
        L_0x0157:
            r8 = move-exception
            r8.printStackTrace()
        L_0x015b:
            return
        L_0x015c:
            java.lang.Object r0 = r8.b
            yv1 r0 = (defpackage.yv1) r0
            boolean r1 = r0.isActive()     // Catch:{ all -> 0x0172 }
            if (r1 == 0) goto L_0x0190
            java.lang.Object r1 = r8.c     // Catch:{ all -> 0x0172 }
            ch7 r1 = (defpackage.ch7) r1     // Catch:{ all -> 0x0172 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0172 }
            r0.resumeWith(r1)     // Catch:{ all -> 0x0172 }
            goto L_0x0190
        L_0x0172:
            r1 = move-exception
            java.lang.Object r8 = r8.o
            r6f r8 = (r6f) r8
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r2 = r1.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            defpackage.udd.u(r8, r1, r2, r3)
            kcc r8 = new kcc
            r8.<init>(r1)
            r0.resumeWith(r8)
        L_0x0190:
            return
        L_0x0191:
            java.lang.Object r0 = r8.b
            itf r0 = (defpackage.itf) r0
            t4b r0 = r0.f
            java.lang.Object r1 = r8.c
            nqd r1 = (defpackage.nqd) r1
            java.lang.Object r8 = r8.o
            w4g r8 = (defpackage.w4g) r8
            r0.h(r1, r8)
            return
        L_0x01a3:
            java.lang.Object r0 = r8.b     // Catch:{ Exception -> 0x01ab }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x01ab }
            java.lang.Object r2 = r0.call()     // Catch:{ Exception -> 0x01ab }
        L_0x01ab:
            p36 r0 = new p36
            java.lang.Object r1 = r8.c
            rf3 r1 = (defpackage.rf3) r1
            ir4 r1 = (defpackage.ir4) r1
            r3 = 18
            r0.<init>((java.lang.Object) r1, (int) r3, (java.lang.Object) r2)
            java.lang.Object r8 = r8.o
            android.os.Handler r8 = (android.os.Handler) r8
            r8.post(r0)
            return
        L_0x01c0:
            java.lang.Object r0 = r8.o     // Catch:{ InterruptedException | ExecutionException -> 0x01ce }
            ch7 r0 = (defpackage.ch7) r0     // Catch:{ InterruptedException | ExecutionException -> 0x01ce }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x01ce }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ InterruptedException | ExecutionException -> 0x01ce }
            boolean r1 = r0.booleanValue()     // Catch:{ InterruptedException | ExecutionException -> 0x01ce }
        L_0x01ce:
            java.lang.Object r0 = r8.b
            p15 r0 = (defpackage.p15) r0
            java.lang.Object r8 = r8.c
            btf r8 = (defpackage.btf) r8
            r0.b(r8, r1)
            return
        L_0x01da:
            java.lang.Object r0 = r8.b
            one.me.messages.list.ui.MessagesListWidget r0 = (one.me.messages.list.ui.MessagesListWidget) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L_0x0201
            k77[] r1 = one.me.messages.list.ui.MessagesListWidget.b1
            one.me.messages.list.ui.recycler.MessagesLayoutManager r1 = r0.n0()
            r1.F = r3
            java.lang.Object r1 = r8.o
            zue r1 = (zue) r1
            long r1 = r1.a()
            uw8 r3 = r0.E0
            int r1 = r3.J(r1)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r0.q0()
            r2.B0(r1)
        L_0x0201:
            k77[] r1 = one.me.messages.list.ui.MessagesListWidget.b1
            one.me.messages.list.ui.recycler.MessagesLayoutManager r0 = r0.n0()
            kc9 r0 = r0.I
            java.lang.Object r8 = r8.c
            z09 r8 = (z09) r8
            r0.f(r8)
            return
        L_0x0211:
            java.lang.Object r1 = r8.b
            vm6 r1 = (defpackage.vm6) r1
            java.lang.Object r3 = r8.c
            afc r3 = (afc) r3
            java.lang.Object r8 = r8.o
            wm6 r8 = (defpackage.wm6) r8
            r8.getClass()
            z4b r4 = r1.b     // Catch:{ IOException -> 0x0251, all -> 0x024e }
            ji0 r4 = (defpackage.ji0) r4     // Catch:{ IOException -> 0x0251, all -> 0x024e }
            tr6 r4 = r4.a     // Catch:{ IOException -> 0x0251, all -> 0x024e }
            android.net.Uri r4 = r4.b     // Catch:{ IOException -> 0x0251, all -> 0x024e }
            java.net.HttpURLConnection r0 = r8.L(r4, r0)     // Catch:{ IOException -> 0x0251, all -> 0x024e }
            b69 r8 = r8.z0     // Catch:{ IOException -> 0x0241 }
            long r4 = r8.now()     // Catch:{ IOException -> 0x0241 }
            r1.e = r4     // Catch:{ IOException -> 0x0241 }
            if (r0 == 0) goto L_0x0243
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ IOException -> 0x0241 }
            r8 = -1
            r3.C(r2, r8)     // Catch:{ IOException -> 0x0241 }
            goto L_0x0243
        L_0x023f:
            r8 = move-exception
            goto L_0x025f
        L_0x0241:
            r8 = move-exception
            goto L_0x0253
        L_0x0243:
            if (r2 == 0) goto L_0x0248
            r2.close()     // Catch:{ IOException -> 0x0248 }
        L_0x0248:
            if (r0 == 0) goto L_0x025e
        L_0x024a:
            r0.disconnect()
            goto L_0x025e
        L_0x024e:
            r8 = move-exception
            r0 = r2
            goto L_0x025f
        L_0x0251:
            r8 = move-exception
            r0 = r2
        L_0x0253:
            r3.B(r8)     // Catch:{ all -> 0x023f }
            if (r2 == 0) goto L_0x025b
            r2.close()     // Catch:{ IOException -> 0x025b }
        L_0x025b:
            if (r0 == 0) goto L_0x025e
            goto L_0x024a
        L_0x025e:
            return
        L_0x025f:
            if (r2 == 0) goto L_0x0264
            r2.close()     // Catch:{ IOException -> 0x0264 }
        L_0x0264:
            if (r0 == 0) goto L_0x0269
            r0.disconnect()
        L_0x0269:
            throw r8
        L_0x026a:
            java.lang.Object r0 = r8.c
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r1 = r8.o
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r1 = (com.google.android.material.appbar.AppBarLayout$BaseBehavior) r1
            android.widget.OverScroller r2 = r1.d
            if (r2 == 0) goto L_0x02a5
            boolean r2 = r2.computeScrollOffset()
            java.lang.Object r3 = r8.b
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            if (r2 == 0) goto L_0x0291
            android.widget.OverScroller r2 = r1.d
            int r2 = r2.getCurrY()
            r1.K(r3, r0, r2)
            java.util.WeakHashMap r1 = defpackage.eaf.a
            r0.postOnAnimation(r8)
            goto L_0x02a5
        L_0x0291:
            fm r0 = (defpackage.fm) r0
            r1.L(r3, r0)
            boolean r8 = r0.D0
            if (r8 == 0) goto L_0x02a5
            android.view.View r8 = com.google.android.material.appbar.AppBarLayout$BaseBehavior.C(r3)
            boolean r8 = r0.h(r8)
            r0.g(r8)
        L_0x02a5:
            return
        L_0x02a6:
            java.lang.Object r0 = r8.o
            w15 r0 = (defpackage.w15) r0
            java.lang.Object r1 = r8.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            xi4 r0 = r0.b(r1)
            java.lang.Object r8 = r8.b
            bw1 r8 = (defpackage.bw1) r8
            r8.getClass()
            defpackage.bj4.c(r8, r0)
            return
        L_0x02bd:
            java.lang.Object r0 = r8.o
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            java.lang.Object r1 = r8.c
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r8.b
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r2 = "Updating proxies: (BatteryNotLowProxy ("
            java.lang.String r4 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            boolean r4 = r8.getBooleanExtra(r4, r3)     // Catch:{ all -> 0x032d }
            java.lang.String r5 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            boolean r5 = r8.getBooleanExtra(r5, r3)     // Catch:{ all -> 0x032d }
            java.lang.String r6 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            boolean r6 = r8.getBooleanExtra(r6, r3)     // Catch:{ all -> 0x032d }
            java.lang.String r7 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            boolean r8 = r8.getBooleanExtra(r7, r3)     // Catch:{ all -> 0x032d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x032d }
            r3.<init>(r2)     // Catch:{ all -> 0x032d }
            r3.append(r4)     // Catch:{ all -> 0x032d }
            java.lang.String r2 = "), BatteryChargingProxy ("
            r3.append(r2)     // Catch:{ all -> 0x032d }
            r3.append(r5)     // Catch:{ all -> 0x032d }
            java.lang.String r2 = "), StorageNotLowProxy ("
            r3.append(r2)     // Catch:{ all -> 0x032d }
            r3.append(r6)     // Catch:{ all -> 0x032d }
            java.lang.String r2 = "), NetworkStateProxy ("
            r3.append(r2)     // Catch:{ all -> 0x032d }
            r3.append(r8)     // Catch:{ all -> 0x032d }
            java.lang.String r2 = "), "
            r3.append(r2)     // Catch:{ all -> 0x032d }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x032d }
            a24 r3 = defpackage.a24.B()     // Catch:{ all -> 0x032d }
            java.lang.String r7 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.a     // Catch:{ all -> 0x032d }
            r3.t(r7, r2)     // Catch:{ all -> 0x032d }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy.class
            defpackage.iia.a(r1, r2, r4)     // Catch:{ all -> 0x032d }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy.class
            defpackage.iia.a(r1, r2, r5)     // Catch:{ all -> 0x032d }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy.class
            defpackage.iia.a(r1, r2, r6)     // Catch:{ all -> 0x032d }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy.class
            defpackage.iia.a(r1, r2, r8)     // Catch:{ all -> 0x032d }
            r0.finish()
            return
        L_0x032d:
            r8 = move-exception
            r0.finish()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.run():void");
    }

    public /* synthetic */ ue3(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ue3(Context context, h13 h13, CountDownLatch countDownLatch) {
        this.a = 10;
        this.c = context;
        this.b = h13;
        this.o = countDownLatch;
    }

    public /* synthetic */ ue3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public ue3(ovf ovf, Context context, StringBuilder sb) {
        this.a = 9;
        this.o = ovf;
        this.c = context;
        this.b = sb;
    }
}
