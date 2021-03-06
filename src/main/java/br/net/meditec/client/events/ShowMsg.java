package br.net.meditec.client.events;

import com.github.gwtbootstrap.client.ui.constants.AlertType;
import com.gwtplatform.dispatch.annotation.GenEvent;
import com.gwtplatform.dispatch.annotation.In;

/**
 * Adiciona uma mensagem na tela.
 * Tratado pela {@link br.net.meditec.client.telas.principal.PrincipalPresenter}
 *
 * @author Carlos A Becker
 */
@GenEvent
public class ShowMsg {
  @In(1)
  String msg;

  @In(2)
  AlertType alertType;
}
