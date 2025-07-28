package defpackage;

/* renamed from: ux9  reason: default package */
public final /* synthetic */ class ux9 extends x26 implements k26 {
    public static final ux9 a = new x26(3, vx9.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vx9 vx9 = (vx9) obj;
        zvc zvc = (zvc) obj2;
        long j = vx9.a;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        jue jue = jue.a;
        if (i <= 0) {
            ((yvc) zvc).X = jue;
        } else {
            p36 p36 = new p36((Object) zvc, 14, (Object) vx9);
            yvc yvc = (yvc) zvc;
            hu3 hu3 = yvc.a;
            yvc.c = ek8.z(hu3).invokeOnTimeout(j, p36, hu3);
        }
        return jue;
    }
}
