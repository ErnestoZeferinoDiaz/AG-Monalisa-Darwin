package ag_monalisa.controller;

import ag_monalisa.model.Configuracion;
import ag_monalisa.model.Fitness.ImgFitness;
import ag_monalisa.view.VPrincipal;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CPrincipal implements ActionListener{
    private VPrincipal vp;
    private JFileChooser select;
    private BufferedImage fimg;
    private Configuracion conf;
    private ImgFitness fit;
    
    public CPrincipal(){
        this.vp = new VPrincipal();
        this.vp.setVisible(true);
        
        this.conf = new Configuracion();
        this.fit = new ImgFitness();
        this.fit.setConf(this.conf);
        
        this.vp.btn_ejecutar.addActionListener(this);
        this.vp.btn_selectImg.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vp.btn_selectImg)){
            cargarImagen();
        }
    }
    
    public void cargarImagen(){
        
        this.select = new JFileChooser();
        this.select.setCurrentDirectory(new File("src/ag_monalisa/img/"));
        this.select.setAcceptAllFileFilterUsed(false);
        this.select.addChoosableFileFilter(new FileNameExtensionFilter("","png","jpg"));
        this.select.showOpenDialog(this.vp);
        try {
            this.fimg = ImageIO.read(this.select.getSelectedFile());
            this.conf.setObj(fimg);
            
            this.vp.pnl_input.setImg(this.fimg);
            this.vp.pnl_output.setLocation(0, this.fimg.getHeight());
            this.vp.pnl_output.setImg(this.fimg);
        } catch (IOException ex) {
            Logger.getLogger(CPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
