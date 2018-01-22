import ListController from './list.controller'
import FormController from './form.controller'

import DoacaoServico from './servico'

export const doacaoConfig = (modulo) => {

  modulo.service('DoacaoServico', DoacaoServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('doacao', {
        template: require('@views/default.html'),
        url: '/doacoes',
        onEnter: ['$state', function($state) {
          $state.go('doacao.list')
        }]
      })
      .state('doacao.list', {
        template: require('@views/doacoes/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('doacao.new', {
        template: require('@views/doacoes/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('doacao.edit', {
        template: require('@views/doacoes/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
