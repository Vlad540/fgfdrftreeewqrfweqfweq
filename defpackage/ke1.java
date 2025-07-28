package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: ke1  reason: default package */
public final class ke1 {
    public static final wia r = new wia("peerid", "WEB_SOCKET");
    public ge1 a;
    public final ac9 b;
    public final cc9 c;
    public final ArrayList d;
    public final List e;
    public final HashMap f = new HashMap();
    public boolean g;
    public float h = 1.0f;
    public xh9 i = xh9.a;
    public wia j;
    public String k;
    public String l;
    public long m;
    public boolean n;
    public boolean o;
    public y41 p;
    public List q = Collections.emptyList();

    public ke1(ge1 ge1, wia wia, ac9 ac9, cc9 cc9) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = Collections.unmodifiableList(arrayList);
        this.a = ge1;
        e(wia);
        if (ac9 == null) {
            new ac9
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR  (r4v2 ? I:ac9) =  call: ac9.<init>():void type: CONSTRUCTOR in method: ke1.<init>(ge1, wia, ac9, cc9):void, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.d = r0
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.h = r0
                xh9 r0 = defpackage.xh9.a
                r1.i = r0
                java.util.List r0 = java.util.Collections.emptyList()
                r1.q = r0
                r1.a = r2
                r1.e(r3)
                if (r4 == 0) goto L_0x002d
                goto L_0x0032
            L_0x002d:
                ac9 r4 = new ac9
                r4.<init>()
            L_0x0032:
                r1.b = r4
                if (r5 == 0) goto L_0x0037
                goto L_0x003c
            L_0x0037:
                cc9 r5 = new cc9
                r5.<init>()
            L_0x003c:
                r1.c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ke1.<init>(ge1, wia, ac9, cc9):void");
        }

        public final boolean a() {
            je1 je1 = je1.b;
            List list = this.e;
            return list.contains(je1) || list.contains(je1.a);
        }

        public final boolean b() {
            return this.j != null;
        }

        public final boolean c() {
            return d() && this.o;
        }

        public final boolean d() {
            return this.c.e && this.n;
        }

        public final boolean e(wia wia) {
            if (wia == null || TextUtils.isEmpty((CharSequence) wia.a) || Objects.equals(this.j, wia)) {
                return false;
            }
            if (this.j == null) {
                this.m = System.currentTimeMillis();
            }
            this.j = wia;
            wia wia2 = (wia) this.f.get(wia);
            if (wia2 == null) {
                return true;
            }
            this.l = (String) wia2.a;
            this.k = (String) wia2.b;
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ke1.class != obj.getClass()) {
                return false;
            }
            ge1 ge1 = this.a;
            return ge1 != null && ge1.equals(((ke1) obj).a);
        }

        public final int hashCode() {
            return Objects.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallParticipant{");
            sb.append(this.a);
            if (this.j != null || !this.f.isEmpty()) {
                sb.append("|registered");
            }
            wia wia = this.j;
            if (wia != null) {
                sb.append("|accepted(");
                sb.append((String) wia.a);
                sb.append(',');
                sb.append(this.l);
                sb.append('/');
                sb.append(this.k);
                sb.append(')');
            }
            if (this.g) {
                sb.append("|connected");
            }
            sb.append('|');
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }
