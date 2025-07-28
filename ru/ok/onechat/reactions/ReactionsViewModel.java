package ru.ok.onechat.reactions;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/onechat/reactions/ReactionsViewModel;", "Luaf;", "Lv92;", "event", "Ljue;", "onEvent", "(Lv92;)V", "Lsj9;", "onNewReactionEvent", "(Lsj9;)V", "Ll89;", "onMessageDeleteEvent", "(Ll89;)V", "d0c", "reactions_release"}, k = 1, mv = {2, 0, 0})
public final class ReactionsViewModel extends uaf {
    public final long b;
    public final bv2 c;
    public final xzc d;
    public final tt0 e;
    public final hzb f;
    public final tkc g = null;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final r7e n;
    public final r7e o;
    public final r7e p;
    public final r7e q;
    public final dbc r;
    public final HashSet s;
    public final r7e t;
    public final hcd u;
    public final s0c v;
    public final grd w;
    public final int x;

    public ReactionsViewModel(long j2, bv2 bv2, xzc xzc, tt0 tt0, hzb hzb, r7e r7e, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978) {
        xzc xzc2 = xzc;
        tt0 tt02 = tt0;
        this.b = j2;
        this.c = bv2;
        this.d = xzc2;
        this.e = tt02;
        this.f = hzb;
        this.h = t973;
        this.i = t974;
        this.j = t975;
        this.k = t97;
        this.l = t977;
        this.m = t978;
        this.x = 1;
        this.n = new r7e(new yzb(this, 0));
        this.o = new r7e(new nya(t976, 8, this));
        this.p = new r7e(new yzb(this, 1));
        new HashMap();
        this.q = new r7e(new yzb(this, 2));
        this.r = new dbc(new k6b(17));
        this.s = new HashSet();
        this.t = new r7e(new k61(this, r7e, t972, 7));
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 4);
        this.u = b2;
        this.v = new s0c(b2);
        grd a = hrd.a((Object) null);
        this.w = a;
        xs7.E(am7.r(this), ((n64) t97.getValue()).a, (ru3) null, new b0c(this, (Continuation) null), 2);
        tt02.d(this);
        ik5 ik5 = new ik5(a, 2);
        int i2 = zp4.o;
        ez3.N(ez3.J(new ck5(new u09(n1g.Z(ik5, mt0.Q(300, eq4.c)), 22), new c0c(this, (Continuation) null), 5), ((n64) t97.getValue()).a), am7.r(this));
        ((vqc) xzc2).m.add(new zzb(new WeakReference(this)));
        hrd.a(Boolean.FALSE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r11v1, types: [a07, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v2, types: [a07, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x027c, code lost:
        if (r0.a(r8, r3) != r2) goto L_0x0280;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(ru.ok.onechat.reactions.ReactionsViewModel r27, defpackage.d0c r28, kotlin.coroutines.Continuation r29) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r27.getClass()
            boolean r3 = r2 instanceof defpackage.h0c
            if (r3 == 0) goto L_0x001c
            r3 = r2
            h0c r3 = (defpackage.h0c) r3
            int r4 = r3.z0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.z0 = r4
            goto L_0x0021
        L_0x001c:
            h0c r3 = new h0c
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.x0
            pu3 r15 = pu3.a
            int r4 = r3.z0
            jue r16 = jue.a
            java.lang.String r14 = "is_dialog="
            java.lang.String r13 = "param1"
            java.lang.String r11 = "value"
            java.lang.String r12 = "ACTION"
            r9 = 4
            r5 = 3
            r6 = 2
            r17 = 0
            r10 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0098
            if (r4 == r10) goto L_0x007d
            if (r4 == r6) goto L_0x006b
            if (r4 == r5) goto L_0x004f
            if (r4 != r9) goto L_0x0047
            wx3.H(r2)
            goto L_0x0280
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            ryb r0 = r3.Z
            yr8 r1 = r3.Y
            java.lang.Object r4 = r3.X
            d0c r4 = (defpackage.d0c) r4
            ru.ok.onechat.reactions.ReactionsViewModel r5 = r3.o
            wx3.H(r2)
            r6 = r4
            r7 = r5
            r19 = r10
            r18 = r13
            r23 = r14
            r2 = r15
            r4 = r0
            r5 = r1
            r1 = r11
            r0 = r12
            goto L_0x01d9
        L_0x006b:
            java.lang.Object r0 = r3.X
            yyb r0 = (defpackage.yyb) r0
            ru.ok.onechat.reactions.ReactionsViewModel r1 = r3.o
            wx3.H(r2)
            r3 = r0
            r4 = r1
            r1 = r11
            r0 = r12
            r24 = r13
            r2 = r14
            goto L_0x0127
        L_0x007d:
            yyb r0 = r3.w0
            ryb r1 = r3.Z
            yr8 r4 = r3.Y
            java.lang.Object r8 = r3.X
            d0c r8 = (defpackage.d0c) r8
            ru.ok.onechat.reactions.ReactionsViewModel r9 = r3.o
            wx3.H(r2)
            r18 = r11
            r11 = r1
            r1 = r8
            r26 = r2
            r2 = r0
            r0 = r9
            r9 = r4
            r4 = r26
            goto L_0x00da
        L_0x0098:
            wx3.H(r2)
            yr8 r2 = r1.d
            if (r2 == 0) goto L_0x00a2
            yyb r4 = r2.c
            goto L_0x00a3
        L_0x00a2:
            r4 = r7
        L_0x00a3:
            r3.o = r0
            r3.X = r1
            r3.Y = r2
            ryb r8 = r1.a
            r3.Z = r8
            r3.w0 = r4
            r3.z0 = r10
            bv2 r9 = r0.c
            aw2 r9 = (defpackage.aw2) r9
            r18 = r11
            long r10 = r0.b
            t0c r9 = r9.m(r10)
            zqd r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            i22 r9 = (defpackage.i22) r9
            if (r9 == 0) goto L_0x00d1
            o62 r9 = r9.b
            long r9 = r9.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            goto L_0x00d2
        L_0x00d1:
            r11 = r7
        L_0x00d2:
            if (r11 != r15) goto L_0x00d6
            goto L_0x0282
        L_0x00d6:
            r9 = r2
            r2 = r4
            r4 = r11
            r11 = r8
        L_0x00da:
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0280
            long r20 = r4.longValue()
            if (r9 == 0) goto L_0x017f
            if (r2 == 0) goto L_0x017f
            ryb r4 = r2.b
            boolean r4 = hhd.f(r4, r11)
            if (r4 == 0) goto L_0x017f
            t97 r4 = r0.h
            java.lang.Object r4 = r4.getValue()
            rv1 r4 = (defpackage.rv1) r4
            long r8 = r1.b
            r3.o = r0
            r3.X = r2
            r3.Y = r7
            r3.Z = r7
            r3.w0 = r7
            r3.z0 = r6
            long r5 = r0.b
            long r10 = r1.c
            r7 = r8
            r22 = r10
            r9 = r20
            r1 = r18
            r18 = r0
            r0 = r12
            r11 = r22
            r24 = r13
            r13 = r2
            r27 = r2
            r2 = r14
            r14 = r3
            java.lang.Object r3 = r4.a(r5, r7, r9, r11, r13, r14)
            if (r3 != r15) goto L_0x0123
            goto L_0x0282
        L_0x0123:
            r3 = r27
            r4 = r18
        L_0x0127:
            t97 r5 = r4.j
            java.lang.Object r5 = r5.getValue()
            mce r5 = (defpackage.mce) r5
            ryb r3 = r3.b
            java.lang.CharSequence r3 = r3.a
            java.lang.String r3 = r3.toString()
            i22 r6 = r4.i()
            if (r6 == 0) goto L_0x0141
            boolean r17 = r6.J()
        L_0x0141:
            r6 = r17
            r5.getClass()
            a07 r7 = new a07
            r7.<init>()
            r7.c = r0
            java.lang.String r0 = "reaction_canceled"
            r7.o = r0
            int r0 = r4.x
            java.lang.String r0 = defpackage.m4b.d(r0)
            r7.b(r0, r1)
            r14 = r24
            r7.b(r3, r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.b(r0, r14)
            ln7 r0 = r7.d()
            t97 r1 = r5.a
            java.lang.Object r1 = r1.getValue()
            bd r1 = (defpackage.bd) r1
            r1.j(r0)
            goto L_0x0280
        L_0x017f:
            r2 = r14
            r14 = r13
            r13 = r18
            r18 = r0
            r0 = r12
            r12 = r18
            t97 r4 = r12.i
            java.lang.Object r4 = r4.getValue()
            sxc r4 = (defpackage.sxc) r4
            long r5 = r1.b
            wr8 r18 = defpackage.wr8.EMOJI
            r3.o = r12
            r3.X = r1
            r3.Y = r9
            r3.Z = r11
            r3.w0 = r7
            r8 = 3
            r3.z0 = r8
            long r7 = r12.b
            r22 = r11
            r23 = r12
            long r11 = r1.c
            r24 = r5
            r5 = r7
            r10 = 0
            r7 = r24
            r24 = r1
            r25 = r9
            r1 = r10
            r19 = 1
            r9 = r20
            r20 = r22
            r21 = r23
            r1 = r13
            r13 = r20
            r23 = r2
            r2 = r14
            r14 = r18
            r18 = r2
            r2 = r15
            r15 = r3
            java.lang.Object r4 = r4.a(r5, r7, r9, r11, r13, r14, r15)
            if (r4 != r2) goto L_0x01d1
        L_0x01ce:
            r15 = r2
            goto L_0x0282
        L_0x01d1:
            r4 = r20
            r7 = r21
            r6 = r24
            r5 = r25
        L_0x01d9:
            t97 r8 = r7.j
            java.lang.Object r8 = r8.getValue()
            mce r8 = (defpackage.mce) r8
            java.lang.CharSequence r9 = r4.a
            java.lang.String r9 = r9.toString()
            i22 r10 = r7.i()
            if (r10 == 0) goto L_0x01f2
            boolean r10 = r10.J()
            goto L_0x01f4
        L_0x01f2:
            r10 = r17
        L_0x01f4:
            if (r5 == 0) goto L_0x01f9
            yyb r5 = r5.c
            goto L_0x01fa
        L_0x01f9:
            r5 = 0
        L_0x01fa:
            if (r5 == 0) goto L_0x01ff
            r5 = r19
            goto L_0x0201
        L_0x01ff:
            r5 = r17
        L_0x0201:
            r8.getClass()
            a07 r11 = new a07
            r11.<init>()
            r11.c = r0
            java.lang.String r0 = "reaction_sent"
            r11.o = r0
            int r0 = r7.x
            java.lang.String r0 = defpackage.m4b.d(r0)
            r11.b(r0, r1)
            r0 = r18
            r11.b(r9, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r9 = r23
            r1.<init>(r9)
            r1.append(r10)
            java.lang.String r9 = ";is_changed="
            r1.append(r9)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r11.b(r1, r0)
            ln7 r0 = r11.d()
            t97 r1 = r8.a
            java.lang.Object r1 = r1.getValue()
            bd r1 = (defpackage.bd) r1
            r1.j(r0)
            t97 r0 = r7.m
            java.lang.Object r0 = r0.getValue()
            gj r0 = (defpackage.gj) r0
            java.lang.CharSequence r1 = r4.a
            java.lang.String r1 = r1.toString()
            ph r0 = r0.g(r1)
            if (r0 == 0) goto L_0x0280
            java.lang.String r14 = r0.d
            if (r14 == 0) goto L_0x0280
            hcd r0 = r7.u
            ryb r9 = r6.a
            ozb r1 = new ozb
            long r10 = r6.b
            r12 = 0
            r15 = 0
            r8 = r1
            r8.<init>(r9, r10, r12, r14, r15)
            r4 = 0
            r3.o = r4
            r3.X = r4
            r3.Y = r4
            r3.Z = r4
            r4 = 4
            r3.z0 = r4
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r2) goto L_0x0280
            goto L_0x01ce
        L_0x0280:
            r15 = r16
        L_0x0282:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.e(ru.ok.onechat.reactions.ReactionsViewModel, d0c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable g(defpackage.ryb r4) {
        /*
            java.lang.CharSequence r4 = r4.a
            int r0 = r4.length()
            r1 = 0
            boolean r2 = r4 instanceof android.text.Spanned     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000e
            android.text.Spanned r4 = (android.text.Spanned) r4     // Catch:{ all -> 0x0019 }
            goto L_0x000f
        L_0x000e:
            r4 = r1
        L_0x000f:
            if (r4 == 0) goto L_0x0019
            java.lang.Class<yld> r2 = defpackage.yld.class
            r3 = 0
            java.lang.Object[] r4 = r4.getSpans(r3, r0, r2)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r4 = r1
        L_0x001a:
            yld[] r4 = (defpackage.yld[]) r4
            if (r4 == 0) goto L_0x002a
            java.lang.Object r4 = cs.Y(r4)
            yld r4 = (defpackage.yld) r4
            if (r4 == 0) goto L_0x002a
            android.graphics.drawable.Drawable r1 = r4.b()
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.onechat.reactions.ReactionsViewModel.g(ryb):android.graphics.drawable.Drawable");
    }

    public final void d() {
        udd.q("ru.ok.onechat.reactions.ReactionsViewModel", "onCleared");
        try {
            this.e.f(this);
        } catch (Throwable unused) {
        }
        f();
    }

    public final void f() {
        udd.q("ru.ok.onechat.reactions.ReactionsViewModel", "cancelChatSubscribeNotifObserving");
        xs7.E(am7.r(this), sk9.a.plus(((n64) this.k.getValue()).a), (ru3) null, new e0c(this, (Continuation) null), 2);
    }

    public final boolean h() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    public final i22 i() {
        return (i22) ((aw2) this.c).m(this.b).a.getValue();
    }

    public final lg7 j(yr8 yr8, boolean z) {
        yyb yyb;
        Object obj;
        yr8 yr82 = yr8;
        lg7 c2 = hwf.c();
        r7e r7e = this.q;
        int i2 = 0;
        if (yr82 != null) {
            List list = yr82.a;
            if (list.size() >= 8) {
                int size = list.size();
                int i3 = 0;
                while (i2 < size) {
                    xr8 xr8 = (xr8) list.get(i2);
                    Iterator it = ((List) r7e.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (hhd.f(((fzb) obj).b, xr8.a.b)) {
                            break;
                        }
                    }
                    fzb fzb = (fzb) obj;
                    yyb yyb2 = yr82.c;
                    if (fzb == null) {
                        ryb ryb = xr8.a.b;
                        c2.add(new fzb(((long) i3) - Long.MIN_VALUE, ryb, g(ryb), ryb.equals(yyb2 != null ? yyb2.b : null)));
                        i3++;
                    } else {
                        if (hhd.f(fzb.b, yyb2 != null ? yyb2.b : null)) {
                            ryb ryb2 = yyb2 != null ? yyb2.b : null;
                            ryb ryb3 = fzb.b;
                            c2.add(new fzb(fzb.a, ryb3, fzb.c, hhd.f(ryb3, ryb2)));
                        } else {
                            c2.add(fzb);
                        }
                    }
                    i2++;
                }
                return hwf.a(c2);
            }
        }
        int size2 = ((List) r7e.getValue()).size();
        while (true) {
            if (i2 >= size2) {
                break;
            }
            fzb fzb2 = (fzb) ((List) r7e.getValue()).get(i2);
            if (i2 == 7 && ((List) r7e.getValue()).size() > 8 && z) {
                c2.add(ezb.a);
                break;
            }
            if (hhd.f(fzb2.b, (yr82 == null || (yyb = yr82.c) == null) ? null : yyb.b)) {
                yyb yyb3 = yr82.c;
                ryb ryb4 = yyb3 != null ? yyb3.b : null;
                ryb ryb5 = fzb2.b;
                c2.add(new fzb(fzb2.a, ryb5, fzb2.c, hhd.f(ryb5, ryb4)));
            } else {
                c2.add(fzb2);
            }
            i2++;
        }
        return hwf.a(c2);
    }

    public final boolean k() {
        i22 i2;
        if (h() && (i2 = i()) != null) {
            return (i2.A() || i2.O()) && !i2.D() && !i2.N();
        }
        return false;
    }

    public final void l(d0c d0c) {
        if (h() && k()) {
            ryb ryb = d0c.a;
            if (h0e.c0(ryb)) {
                udd.U("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: reaction is blank!");
            } else if (!this.s.contains(Long.valueOf(d0c.c))) {
                udd.p("ru.ok.onechat.reactions.ReactionsViewModel", "updateSelfReaction: %s for %d", new Object[]{ryb, Long.valueOf(d0c.b)});
                this.w.m((Object) null, new i05(d0c));
            }
        }
    }

    @a1e
    public final void onEvent(v92 v92) {
        long j2 = this.b;
        Long valueOf = Long.valueOf(j2);
        Long l2 = v92.c;
        udd.p("ru.ok.onechat.reactions.ReactionsViewModel", "onEvent: ChatLastReactionUpdatedEvent: chat.id = %d, event.lastReactedMessageId = %d", new Object[]{valueOf, l2});
        if (j2 == v92.b && l2 != null) {
            long longValue = l2.longValue();
            tkc tkc = this.g;
            if (tkc != null) {
                tkc.b(Long.valueOf(longValue), "lastReactedMessageId");
            }
        }
    }

    @a1e
    public final void onMessageDeleteEvent(l89 l89) {
        if (l89.b == this.b) {
            this.s.addAll(l89.X);
        }
    }

    @a1e
    public final void onNewReactionEvent(sj9 sj9) {
        ph g2;
        String str;
        if (this.b == sj9.b) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, "ru.ok.onechat.reactions.ReactionsViewModel", "onNewReactionEvent=" + sj9, (Throwable) null);
            }
            ryb ryb = (ryb) o23.W(sj9.Y);
            if (ryb != null && (g2 = ((gj) this.m.getValue()).g(ryb.a.toString())) != null && (str = g2.d) != null) {
                this.u.g(new ozb(ryb, sj9.o, sj9.X, str, !sj9.c));
            }
        }
    }
}
