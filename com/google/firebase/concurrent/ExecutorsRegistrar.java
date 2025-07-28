package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final v97 BG_EXECUTOR = new v97(new j83(1));
    static final v97 BLOCKING_EXECUTOR = new v97(new j83(3));
    static final v97 LITE_EXECUTOR = new v97(new j83(2));
    static final v97 SCHEDULER = new v97(new j83(4));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new qx3(str, i, (StrictMode.ThreadPolicy) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(f83 f83) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(f83 f83) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(f83 f83) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new ae4(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    public List<t73> getComponents() {
        Class<ld0> cls = ld0.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        pjb pjb = new pjb(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        pjb[] pjbArr = {new pjb(cls, cls3), new pjb(cls, cls4)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pjb);
        for (pjb j : pjbArr) {
            n06.j(j, "Null interface");
        }
        Collections.addAll(hashSet, pjbArr);
        t73 t73 = new t73((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i74(12), hashSet3);
        Class<eo0> cls5 = eo0.class;
        pjb pjb2 = new pjb(cls5, cls2);
        pjb[] pjbArr2 = {new pjb(cls5, cls3), new pjb(cls5, cls4)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pjb2);
        for (pjb j2 : pjbArr2) {
            n06.j(j2, "Null interface");
        }
        Collections.addAll(hashSet4, pjbArr2);
        t73 t732 = new t73((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new i74(13), hashSet6);
        Class<tc7> cls6 = tc7.class;
        pjb pjb3 = new pjb(cls6, cls2);
        pjb[] pjbArr3 = {new pjb(cls6, cls3), new pjb(cls6, cls4)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pjb3);
        for (pjb j3 : pjbArr3) {
            n06.j(j3, "Null interface");
        }
        Collections.addAll(hashSet7, pjbArr3);
        t73 t733 = new t73((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new i74(14), hashSet9);
        g68 a = t73.a(new pjb(zte.class, cls4));
        a.f = new i74(15);
        return Arrays.asList(new t73[]{t73, t732, t733, a.b()});
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new qx3(str, i, threadPolicy);
    }
}
