package br.net.meditec.client.telas.contato;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Widget;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.Form;
import com.github.gwtbootstrap.client.ui.TextBox;
import com.github.gwtbootstrap.datepicker.client.ui.DateBox;
import com.gwtplatform.mvp.client.ViewImpl;

import java.util.Date;

import br.net.meditec.client.telas.ClickEnterUpHandler;

/**
 * Implementação da View de cadastro de contato.
 *
 * @author Carlos A Becker
 */
public class CadastroContatoViewImpl extends ViewImpl
    implements CadastroContatoPresenter.CadastroContatoView {

  private Widget w;

  @UiField
  TextBox nome;

  @UiField
  TextBox sobrenome;

  @UiField
  TextBox email;

  @UiField
  TextBox telefone;

  @UiField
  DateBox dataNascimento;

  @UiField
  Button salvar;

  @UiField
  Button cancelar;

  @UiField
  Button novo;

  @UiField
  Button excluir;

  public CadastroContatoViewImpl() {
    w = ourUiBinder.createAndBindUi(this);
  }

  public Widget asWidget() {
    return w;
  }

  @Override
  public void addSalvarHandler(ClickEnterUpHandler handler) {
    salvar.addClickHandler(handler);
    nome.addKeyUpHandler(handler);
    sobrenome.addKeyUpHandler(handler);
    telefone.addKeyUpHandler(handler);
    email.addKeyUpHandler(handler);
//    dataNascimento.add
  }

  @Override
  public void addCancelarHandler(ClickHandler handler) {
    cancelar.addClickHandler(handler);
  }

  @Override
  public void addNovoHandler(ClickHandler handler) {
    novo.addClickHandler(handler);
  }

  @Override
  public void addExcluirHandler(ClickHandler handler) {
    excluir.addClickHandler(handler);
  }

  public HasValue<String> nome() {
    return nome;
  }

  public HasValue<String> sobrenome() {
    return sobrenome;
  }

  public HasValue<String> email() {
    return email;
  }

  public HasValue<String> numero() {
    return telefone;
  }

  public HasValue<Date> dataNascimento() {
    return dataNascimento;
  }


  interface CadastroContatoViewImplUiBinder extends
                                            UiBinder<HTMLPanel, CadastroContatoViewImpl> {

  }

  private static
  CadastroContatoViewImplUiBinder
      ourUiBinder =
      GWT.create(CadastroContatoViewImplUiBinder.class);
}