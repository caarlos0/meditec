package br.net.meditec.server.model;

import java.io.Serializable;

/**
 * @author Carlos A Becker
 */
public interface Bean extends Serializable {

  void setId(Long id);

  Long getId();
}
