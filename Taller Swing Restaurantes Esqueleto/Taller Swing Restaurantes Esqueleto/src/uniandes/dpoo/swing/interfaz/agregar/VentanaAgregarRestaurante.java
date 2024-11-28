package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import uniandes.dpoo.swing.interfaz.mapa.PanelMapaVisualizar;
import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );
        
        
        panelMapa= new PanelMapaAgregar();
        panelMapa.getCoordenadas();
        add(panelMapa, BorderLayout.SOUTH);
        
        JPanel panelOpciones = new JPanel(new FlowLayout());
        panelDetalles = new PanelEditarRestaurante();
        add(panelDetalles, BorderLayout.SOUTH);

        panelBotones= new PanelBotonesAgregar(null);
        
        add(panelOpciones, BorderLayout.SOUTH);
        // Agrega el panel donde va a estar el mapa
        // TODO completar

        // Agrega en el sur un panel para los detalles del restaurante y para los botones
        // TODO completar

        // Termina de configurar la ventana
        pack( );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setResizable( false );
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
        // TODO completar
    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
