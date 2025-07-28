package defpackage;

import android.os.Bundle;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.List;

/* renamed from: r62  reason: default package */
public final class r62 implements z24 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t62 d = t62.b;

    public r62(t97 t97, t97 t972, t97 t973) {
        this.a = t973;
        this.b = t97;
        this.c = t972;
    }

    public final g34 a() {
        return this.d;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        q62 q62;
        h34 h34;
        Bundle bundle2;
        c34 c342 = c34;
        Bundle bundle3 = bundle;
        List list = null;
        if (!this.d.a.contains(c342)) {
            return null;
        }
        if (c342.equals(t62.c)) {
            wia wia = new wia(HasExtraData.KEY_ID, Long.valueOf(x87.E0(HasExtraData.KEY_ID, bundle3)));
            qr4 qr4 = s62.b;
            String G0 = x87.G0("type", bundle3);
            qr4.getClass();
            wia wia2 = new wia("type", qr4.r(G0));
            wia wia3 = new wia("load_mark", x87.t0("load_mark", bundle3));
            wia wia4 = new wia("message_id", x87.t0("message_id", bundle3));
            if (bundle3.containsKey("highlights")) {
                list = h0e.q0(x87.G0("highlights", bundle3), new String[]{","}, true, 4);
            }
            q62 = new q62(jjd.j(wia, wia2, wia3, wia4, new wia("highlights", list), new wia("highlight_message", x87.s0("highlight_message", bundle3)), new wia("from_forward", x87.s0("from_forward", bundle3)), new wia("forward_msg_ids", x87.u0("forward_msg_ids", bundle3)), new wia("forward_attach_id", x87.t0("forward_attach_id", bundle3)), new wia("is_forward_attach", x87.s0("is_forward_attach", bundle3))), 0);
        } else if (c342.equals(t62.d)) {
            if (((xzc) this.b.getValue()).u()) {
                i22 i22 = (i22) ((qkc) this.a.getValue()).a.getValue();
                if (i22 != null) {
                    bundle2 = new Bundle();
                    bundle2.putLong(HasExtraData.KEY_ID, i22.a);
                    bundle2.putParcelable("type", s62.LOCAL_ID);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                bundle2 = new Bundle();
                bundle2.putLong(HasExtraData.KEY_ID, 1);
                bundle2.putParcelable("type", s62.LOCAL_ID);
            }
            q62 = new q62(bundle2, 1);
        } else {
            throw new IllegalStateException(hr1.f("invalid route ", c342));
        }
        if (((jb5) this.c.getValue()).t()) {
            h34 = new h34(new p22(6), new p22(7));
        } else {
            new h34
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013a: CONSTRUCTOR  (r0v6 ? I:h34) =  call: h34.<init>():void type: CONSTRUCTOR in method: r62.b(java.lang.String, c34, android.os.Bundle):j34, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v6 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 38 more
                */
            /*
                this = this;
                r0 = r17
                r2 = r19
                r3 = r20
                t62 r1 = r0.d
                java.util.LinkedHashSet r1 = r1.a
                boolean r1 = r1.contains(r2)
                r4 = 0
                if (r1 != 0) goto L_0x0012
                return r4
            L_0x0012:
                c34 r1 = defpackage.t62.c
                boolean r1 = r2.equals(r1)
                java.lang.String r5 = "type"
                java.lang.String r6 = "id"
                if (r1 == 0) goto L_0x00b9
                long r7 = x87.E0(r6, r3)
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                wia r7 = new wia
                r7.<init>(r6, r1)
                qr4 r1 = defpackage.s62.b
                java.lang.String r6 = x87.G0(r5, r3)
                r1.getClass()
                s62 r1 = defpackage.qr4.r(r6)
                wia r8 = new wia
                r8.<init>(r5, r1)
                java.lang.String r1 = "load_mark"
                java.lang.Long r5 = x87.t0(r1, r3)
                wia r9 = new wia
                r9.<init>(r1, r5)
                java.lang.String r1 = "message_id"
                java.lang.Long r5 = x87.t0(r1, r3)
                wia r10 = new wia
                r10.<init>(r1, r5)
                java.lang.String r1 = "highlights"
                boolean r5 = r3.containsKey(r1)
                if (r5 == 0) goto L_0x006b
                java.lang.String r4 = x87.G0(r1, r3)
                java.lang.String r5 = ","
                java.lang.String[] r5 = new java.lang.String[]{r5}
                r6 = 1
                r11 = 4
                java.util.List r4 = defpackage.h0e.q0(r4, r5, r6, r11)
            L_0x006b:
                wia r11 = new wia
                r11.<init>(r1, r4)
                java.lang.String r1 = "highlight_message"
                java.lang.Boolean r4 = x87.s0(r1, r3)
                wia r12 = new wia
                r12.<init>(r1, r4)
                java.lang.String r1 = "from_forward"
                java.lang.Boolean r4 = x87.s0(r1, r3)
                wia r13 = new wia
                r13.<init>(r1, r4)
                java.lang.String r1 = "forward_msg_ids"
                long[] r4 = x87.u0(r1, r3)
                wia r14 = new wia
                r14.<init>(r1, r4)
                java.lang.String r1 = "forward_attach_id"
                java.lang.Long r4 = x87.t0(r1, r3)
                wia r15 = new wia
                r15.<init>(r1, r4)
                java.lang.String r1 = "is_forward_attach"
                java.lang.Boolean r4 = x87.s0(r1, r3)
                wia r5 = new wia
                r5.<init>(r1, r4)
                r16 = r5
                wia[] r1 = new defpackage.wia[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
                android.os.Bundle r1 = defpackage.jjd.j(r1)
                q62 r4 = new q62
                r5 = 0
                r4.<init>(r1, r5)
                r6 = r4
                goto L_0x0115
            L_0x00b9:
                c34 r1 = defpackage.t62.d
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L_0x014e
                t97 r1 = r0.b
                java.lang.Object r1 = r1.getValue()
                xzc r1 = (xzc) r1
                vqc r1 = (vqc) r1
                boolean r1 = r1.u()
                if (r1 == 0) goto L_0x00ff
                t97 r1 = r0.a
                java.lang.Object r1 = r1.getValue()
                qkc r1 = (qkc) r1
                zqd r1 = r1.a
                java.lang.Object r1 = r1.getValue()
                i22 r1 = (i22) r1
                if (r1 == 0) goto L_0x00f3
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                long r7 = r1.a
                r4.putLong(r6, r7)
                s62 r1 = defpackage.s62.LOCAL_ID
                r4.putParcelable(r5, r1)
                goto L_0x010e
            L_0x00f3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Required value was null."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ff:
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                r7 = 1
                r4.putLong(r6, r7)
                s62 r1 = defpackage.s62.LOCAL_ID
                r4.putParcelable(r5, r1)
            L_0x010e:
                q62 r1 = new q62
                r5 = 1
                r1.<init>(r4, r5)
                r6 = r1
            L_0x0115:
                t97 r0 = r0.c
                java.lang.Object r0 = r0.getValue()
                jb5 r0 = (jb5) r0
                kb5 r0 = (kb5) r0
                boolean r0 = r0.t()
                if (r0 == 0) goto L_0x0138
                h34 r0 = new h34
                p22 r1 = new p22
                r4 = 6
                r1.<init>(r4)
                p22 r4 = new p22
                r5 = 7
                r4.<init>(r5)
                r0.<init>(r1, r4)
            L_0x0136:
                r5 = r0
                goto L_0x013e
            L_0x0138:
                h34 r0 = new h34
                r0.<init>()
                goto L_0x0136
            L_0x013e:
                j34 r8 = new j34
                r7 = 8
                r4 = 0
                r0 = r8
                r1 = r18
                r2 = r19
                r3 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
            L_0x014e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "invalid route "
                java.lang.String r1 = defpackage.hr1.f(r1, r2)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.r62.b(java.lang.String, c34, android.os.Bundle):j34");
        }
    }
