[1mdiff --git a/build/classes/ag_monalisa/controller/CPrincipal.class b/build/classes/ag_monalisa/controller/CPrincipal.class[m
[1mindex 01c8f45..ac1701b 100644[m
Binary files a/build/classes/ag_monalisa/controller/CPrincipal.class and b/build/classes/ag_monalisa/controller/CPrincipal.class differ
[1mdiff --git a/src/ag_monalisa/controller/CPrincipal.java b/src/ag_monalisa/controller/CPrincipal.java[m
[1mindex c2eb400..053d7bf 100644[m
[1m--- a/src/ag_monalisa/controller/CPrincipal.java[m
[1m+++ b/src/ag_monalisa/controller/CPrincipal.java[m
[36m@@ -1,6 +1,7 @@[m
 package ag_monalisa.controller;[m
 [m
 import ag_monalisa.model.Configuracion;[m
[32m+[m[32mimport ag_monalisa.model.Fitness.ImgComparador;[m[41m[m
 import ag_monalisa.model.Fitness.ImgFitness;[m
 import ag_monalisa.view.VPrincipal;[m
 import java.awt.Rectangle;[m
[36m@@ -22,6 +23,7 @@[m [mpublic class CPrincipal implements ActionListener{[m
     private BufferedImage fimg;[m
     private Configuracion conf;[m
     private ImgFitness fit;[m
[32m+[m[32m    private ImgComparador comp;[m[41m[m
     [m
     public CPrincipal(){[m
         this.vp = new VPrincipal();[m
[36m@@ -29,7 +31,13 @@[m [mpublic class CPrincipal implements ActionListener{[m
         [m
         this.conf = new Configuracion();[m
         this.fit = new ImgFitness();[m
[32m+[m[32m        this.comp = new ImgComparador();[m[41m[m
[32m+[m[41m        [m
         this.fit.setConf(this.conf);[m
[32m+[m[32m        this.conf.setFitness(this.fit);[m[41m[m
[32m+[m[32m        this.conf.setCompare(this.comp);[m[41m[m
[32m+[m[32m        this.conf.setNoPoblacion(200);[m[41m[m
[32m+[m[41m        [m
         [m
         this.vp.btn_ejecutar.addActionListener(this);[m
         this.vp.btn_selectImg.addActionListener(this);[m
